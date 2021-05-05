package bai_17.baitap;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class InputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\C0221G1_LeVanHuynhDuc\\src\\bai_17\\baitap\\testfiel.csv");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Product> list = (List<Product>) ois.readObject();
            for (Product s : list) {
                System.out.println(s.toString());
            }
            fis.close();
            ois.close();
        } catch (Exception ex) {
            System.out.println("Loi doc file: " + ex);
        }
    }
}
