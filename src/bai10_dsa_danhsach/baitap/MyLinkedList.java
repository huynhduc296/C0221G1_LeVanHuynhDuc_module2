package bai10_dsa_danhsach.baitap;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;
    private final int DEFAULT_CAPACITY = 10;

    public MyLinkedList() {
        this.numNodes = DEFAULT_CAPACITY;
    }

    public MyLinkedList(Object data) {

    }

    public class Node {
        public Node next;
        public Object data;

        public Node() {
        }

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index : " + index);
        } else if (index == 0) {
            addFirst(element);
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
        }
        numNodes++;
    }
    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index " + index);
        } else {
            Node temp = head;
            Object data;
            if (index == 0) {
                data = head.data;
                head = head.next;
            } else {
                for (int i = 0; i < index - 1 && temp.next != null; i++) {
                    temp = temp.next;
                }
                data = temp.next.data;
                temp.next = temp.next.next;
            }
            numNodes--;
            return (E) data;
        }
    }
}
