package bai4_oop.baitap;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số a");
        double a=scanner.nextDouble();
        System.out.println("Nhập số b");
        double b=scanner.nextDouble();
        System.out.println("Nhập số c");
        double c=scanner.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()>=0){
            System.out.println("Phuong trình 2 nghiẹm"+quadraticEquation.getRoot1()+" "+quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.println("Phuong trình 1 nghiệm"+quadraticEquation.getRoot1());
        }else {
            System.out.println("phuong trình vô nghiêm");
        }
    }
}
