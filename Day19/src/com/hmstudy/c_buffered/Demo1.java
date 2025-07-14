package com.hmstudy.c_buffered;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        getFileReader1();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }

    public static void getFileReader() throws IOException {
        File file = new File("D:\\program\\JAVA\\Java_Study\\Day19\\src\\com\\hmstudy\\c_buffered\\1.txt");

        FileInputStream fileInputStream = new FileInputStream(file);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int content = -1;
        while((content = bufferedInputStream.read()) != -1) {

        }
        bufferedInputStream.close();
    }

    public static void getFileReader1() throws IOException {
        File file = new File("D:\\program\\JAVA\\Java_Study\\Day19\\src\\com\\hmstudy\\c_buffered\\1.txt");

        FileInputStream fileInputStream = new FileInputStream(file);

        int length = -1;
        byte[] buf = new byte[1024 * 1];
        while((length = fileInputStream.read(buf)) != -1) {

        }
        fileInputStream.close();
    }
}
