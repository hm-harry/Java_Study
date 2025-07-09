package com.hmstudy.c_file;

import java.io.File;
import java.io.FilenameFilter;

public class Demo8 {
    public static void main(String[] args) {
        File file = new File("D:\\program\\JAVA\\Java_Study\\Day17\\src\\com\\hmstudy\\c_file");

        File[] listFiles = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && name.endsWith(".java");
            }
        });

        for (File f : listFiles) {
            System.out.println(f.getName());
        }
    }
}
