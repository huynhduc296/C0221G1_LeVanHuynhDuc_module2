package bai_15.baitap;

import java.util.Scanner;

public class TestTriangle {
    static void validate(double edge1,double edge2,double edge3)throws IllegalTriangleException{
        if((edge1+edge2)<=3||(edge1+edge3)<=2||(edge2+edge3)<=edge1){
            throw new IllegalTriangleException("3 canh ko hop le");
        }else {
            System.out.println("Nhập thành công");
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true){
            try {
                System.out.println("nhap cạnh 1: ");
                String edge1=scanner.nextLine();
                System.out.println("nhap cạnh 2: ");
                String edge2=scanner.nextLine();
                System.out.println("nhap cạnh 3: ");
                String edge3=scanner.nextLine();
                validate(Integer.parseInt(edge1),Integer.parseInt(edge2),Integer.parseInt(edge3));
                break;
            } catch (IllegalTriangleException illegalTriangleException) {
                System.out.println("tong 2 canh phai lon hon canh con lai:"+illegalTriangleException);
            }catch (Exception exception){
                System.out.println("loi nhap");
            }
            System.out.println("nhap lai");
        }

    }
}
