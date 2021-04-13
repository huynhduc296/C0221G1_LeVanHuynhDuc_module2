package bai10_dsa_danhsach.baitap;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];


    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }


    public E get(int i){
        checkIndex(i);
        return (E) elements[i];
    }


    MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void disPlay(){
        for(int i=0;i<size-1;i++){
            System.out.println(elements[i]);
        }
    }

    public void add(int index , E element){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index : "+index);
        } else if (size == elements.length){
            this.ensureCapacity();
        } else {
            size++;
            for (int i = elements.length -1; i > index; i--) {
                elements[i] = elements[i -1];
            }
            elements[index] = element;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
        }
    }

    public E remove(int index){
        checkIndex(index);
        E e= (E) elements[index];
        for (int i=index;i<size-1;i++)
            elements[i]=elements[i+1];
        elements[size-1]=null;
        size--;
        return e;
    }


    private void ensureCapacity() {
        if (size >= elements.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(elements, 0, newData, 0, size);
            elements = newData;
        }
    }
}
