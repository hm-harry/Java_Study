package com.hmstudy.b_io;

import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("D:\\program\\JAVA\\Java_Study\\Day19\\src\\com\\hmstudy\\b_io\\2.txt");
            char[] charArray = "this is a test".toCharArray();

            fileWriter.write(charArray);
            fileWriter.write("\thello world");
            fileWriter.write("\r\n");
            fileWriter.write("hello", 0, 2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    private static void getFileWriter() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("D:\\program\\JAVA\\Java_Study\\Day19\\src\\com\\hmstudy\\b_io\\1.txt", true);
            fileWriter.write("hello world");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
