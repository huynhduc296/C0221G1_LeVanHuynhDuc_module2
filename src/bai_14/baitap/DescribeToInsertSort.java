package bai_14.baitap;

public class DescribeToInsertSort {
    public static void sort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (list[j] > key) {
                    list[j + 1] = list[j];
                } else {
                    break;
                }
            }
            System.out.println("----chen phan tu: " + key + " -----");
            list[j + 1] = key;
            disPlay(list, i+1);
        }
    }

    public static void disPlay(int[] list, int index) {
        for (int i = 0; i < index; i++) {
            System.out.print(list[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] list = {3, 1, 4, 2, 11, 6, 23, 10, 78, 7, 8, 9, 100};
        System.out.println("------------");
        System.out.println(list[0]);
        DescribeToInsertSort.sort(list);
    }
}
