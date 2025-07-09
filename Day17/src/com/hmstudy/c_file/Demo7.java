package com.hmstudy.c_file;

import java.io.File;

public class Demo7 {
    public static void main(String[] args) {
        File[] listRoots = File.listRoots();
        for (File file : listRoots) {
            System.out.println(file);
        }

        File file = new File("D:\\program\\JAVA\\Java_Study\\Day17");
        File[] listfiles = file.listFiles();
        for (File file1 : listfiles) {
            System.out.println(file1);
        }

        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
