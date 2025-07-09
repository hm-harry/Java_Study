package com.hmstudy.c_file;

import java.io.File;
import java.io.IOException;


public class Demo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\program\\JAVA\\Java_Study\\Day17");
        File file2 = new File(file, "3.txt");
        // System.out.println(file2.createNewFile());

        // File file3 = new File(file, "bbb");
        // System.out.println(file3.mkdir());

        // File file4 = new File("D:\\program\\JAVA\\Java_Study\\Day17\\ccc\\ddd\\eee");
        // System.out.println(file4.mkdirs());

        file2.renameTo(new File("D:\\program\\JAVA\\Java_Study\\Day17\\bbb\\2.txt"));

    }
}
