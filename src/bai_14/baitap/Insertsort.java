package bai_14.baitap;

import java.util.Scanner;

public class Insertsort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter list size");
        int size=scanner.nextInt();
        int[]list=new int[size];
        for (int i=0;i<list.length;i++){
            list[i]=scanner.nextInt();
        }
        for (int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
        System.out.println("\nBegin sort processing...");
        Insertsort.insertionSort(list);
        disPlay(list);
    }
    public static void insertionSort(int[] list) {
        for (int i=0;i<list.length;i++){
            int key  =list[i];
            int j= i-1;
            while (j>=0&&list[j]>key){
                list[j+1]=list[j];
                j--;
            }
            list[j+1]=key;
        }
    }
    static void disPlay(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "  ");
        }
    }
}
