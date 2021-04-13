package bai10_dsa_danhsach.thuchanh;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList LL= new MyLinkedList(10);
        LL.addFirst(5);
        LL.addFirst(4);
        LL.addFirst(12);

        LL.add(4,9);
        LL.add(4,9);
        LL.printList();

    }
}
