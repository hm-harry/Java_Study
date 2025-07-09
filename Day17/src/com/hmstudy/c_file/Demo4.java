package com.hmstudy.c_file;

import java.io.File;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println(new File("D:\\program\\JAVA\\Java_Study\\Day17\\1.txt").isFile());
        System.out.println(new File("D:\\program\\JAVA\\Java_Study\\Day17\\1.txt").isDirectory());
        System.out.println(new File("D:\\program\\JAVA\\Java_Study\\Day17\\ccc").isFile());
        System.out.println(new File("D:\\program\\JAVA\\Java_Study\\Day17\\ccc").isDirectory());

        System.out.println("---------------------------------------");
        System.out.println(new File("D:\\program\\JAVA\\Java_Study\\Day17\\111.txt").isFile());
        System.out.println(new File("D:\\program\\JAVA\\Java_Study\\Day17\\abc").isDirectory());

        System.out.println("---------------------------------------");
        System.out.println(new File("D:\\program\\JAVA\\Java_Study\\Day17\\1.txt").isAbsolute());
        System.out.println(new File("D:\\program\\JAVA\\Java_Study\\Day17\\20.txt").isAbsolute());
        System.out.println(new File("1.txt").isAbsolute());

        System.out.println("---------------------------------------");
        System.out.println(new File("D:\\program\\JAVA\\Java_Study\\Day17\\1.txt").isHidden());
        System.out.println(new File("D:\\program\\JAVA\\Java_Study\\Day17\\2.txt").isHidden());

        System.out.println("---------------------------------------");
        System.out.println(new File("D:\\program\\JAVA\\Java_Study\\Day17\\1.txt").exists());
        System.out.println(new File("D:\\program\\JAVA\\Java_Study\\Day17\\111.txt").exists());
    }
}
