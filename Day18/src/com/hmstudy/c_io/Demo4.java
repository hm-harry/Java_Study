package com.hmstudy.c_io;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class Demo4 {
    public static void main(String[] args) {
        // getFileReader();
        getFileReader2();
    }
    private static void getFileReader2() {
        FileReader fileReader = null;
        File file = new File("D:\\program\\JAVA\\Java_Study\\Day18\\src\\com\\hmstudy\\c_io\\2.txt");
        try {
            fileReader = new FileReader(file);

            char[] buf = new char[1024 * 4];
            int length = -1;
            while ((length = fileReader.read(buf)) != -1) {
                System.out.println(new String(buf, 0, length));
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    private static void getFileReader() {
        FileReader fileReader = null;
        
        try {
            fileReader = new FileReader(new File("D:\\program\\JAVA\\Java_Study\\Day18\\src\\com\\hmstudy\\c_io\\2.txt"));

            // System.out.println((char)fileReader.read());
            // System.out.println((char)fileReader.read());
            // System.out.println((char)fileReader.read());
            // System.out.println((char)fileReader.read());

            int content = -1;
            while ((content = fileReader.read()) != -1) {
                System.out.println((char)content);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
