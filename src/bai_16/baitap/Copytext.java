package bai_16.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Copytext {
    public static List<String> readFile(String filePath) {
        List<String> stringList = new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(filePath);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringList;
    }

    public static void writeFile(String filePath, String line) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(filePath);
            fileWriter = new FileWriter(filePath, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String targetPathFile = "D:\\C0221G1_LeVanHuynhDuc\\src\\bai_16\\baitap\\test.csv";
        String sourcePathFile = "D:\\C0221G1_LeVanHuynhDuc\\src\\bai_16\\baitap\\test1.csv";
        File file = new File(targetPathFile);
        if (file.length() == 0 || file.length() == 2) {
            List<String> listLine = readFile(sourcePathFile);
            for (String line : listLine) {
                writeFile(targetPathFile, line);
            }
            System.out.println("sao chep thanh cong");
        } else {
            System.out.println("file target da co du lieu");
        }
    }
}
