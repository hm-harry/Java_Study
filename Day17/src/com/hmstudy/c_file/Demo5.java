package com.hmstudy.c_file;

import java.io.File;

public class Demo5 {
    public static void main(String[] args) {
        String str = "F:\\program\\JAVA\\Java_Study\\Da17\\aaa.txt";
        File file = new File("F:\\program\\JAVA\\Java_Study\\Da17\\aaa.txt");
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(str.substring(str.lastIndexOf('\\') + 1));

        System.out.println(file.getParent());
        System.out.println(str.substring(0, str.lastIndexOf('\\')));

        System.out.println(new File(".").getAbsolutePath());
    }
}
