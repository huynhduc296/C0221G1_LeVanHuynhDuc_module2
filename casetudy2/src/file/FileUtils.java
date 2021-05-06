package file;

import javax.xml.ws.Service;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils<E>{
    public void writeFile(String pathFile, E e, boolean a) {
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(pathFile, a);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(e.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (Exception m) {
            m.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
    public void writeList(String pathFile, List<E>e, boolean a){
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter;
        try {
            fileWriter= new FileWriter(pathFile, a);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (E codegym : e){
                bufferedWriter.write(codegym.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (Exception m) {
            m.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    public List<String[]> readerFile(String pathFile) {
        List<String[]> listLine = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            String line=null;
            String[] strings=null;

            while ((line=bufferedReader.readLine())!=null){
                String[]lineList=line.split(",");
                listLine.add(lineList);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }
        }
