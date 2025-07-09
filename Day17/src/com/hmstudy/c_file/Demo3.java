package com.hmstudy.c_file;

import java.io.File;

public class Demo3 {
    public static void main(String[] args) {
        File file = new File("D:\\program\\JAVA\\Java_Study\\Day17\\1.txt");
        File file2 = new File("D:\\program\\JAVA\\Java_Study\\Day17\\2.txt");

        file2.deleteOnExit();

        boolean ret = file.delete();
        System.out.println(ret);
    }
}
