package com.hmstudy.c_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // getFileInputStream2();
        // getFileInputStream();
        
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    private static void getFileInputStream2() {
        File file = new File("D:\\program\\JAVA\\Java_Study\\Day18\\src\\com\\hmstudy\\c_io\\1.txt");

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);

            // 准备一个8KB的缓冲区
            byte[] buf = new byte[1024 * 8];
            int length = -1;

            // 读取数据
            while ((length = fileInputStream.read(buf)) != -1) {
                System.out.println(new String(buf, 0, length));
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    private static void getFileInputStream() {
        File file = new File("D:\\program\\JAVA\\Java_Study\\Day18\\src\\com\\hmstudy\\c_io\\1.txt");

        FileInputStream fileInputStream = null;
        
        try {
            fileInputStream = new FileInputStream(file);

            int content = -1;

            while ((content = fileInputStream.read()) != -1) {
                System.out.println((char)content);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (null != fileInputStream) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
