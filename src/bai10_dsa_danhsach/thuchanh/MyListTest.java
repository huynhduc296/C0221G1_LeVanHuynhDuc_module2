package bai10_dsa_danhsach.thuchanh;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer>ListIntager=new MyList<Integer>();
        ListIntager.add(1);
        ListIntager.add(2);
        ListIntager.add(3);
        ListIntager.add(4);
        ListIntager.add(7);

        System.out.println("element 4:"+ListIntager.get(4));
        System.out.println("element 1:"+ListIntager.get(1));
        System.out.println("element 2:"+ListIntager.get(2));
        ListIntager.get(6);
        System.out.println("element -1:"+ListIntager.get(6));
    }
}
