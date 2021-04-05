package bai4_oop.thuchanh;

import bai4_oop.thuchanh.HinhChuNhat;
import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        HinhChuNhat hinhChuNhat = new HinhChuNhat(width, height);
        System.out.println("Your Rectangle \n"+ hinhChuNhat.display());
        System.out.println("Perimeter of the Rectangle: "+ hinhChuNhat.getPerimeter());
        System.out.println("Area of the Rectangle: "+ hinhChuNhat.getArea());
    }
}
