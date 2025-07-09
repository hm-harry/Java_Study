package com.hmstudy.c_file;

import java.io.File;
import java.text.SimpleDateFormat;

public class Day6 {
    public static void main(String[] args) {
        File file = new File("D:\\program\\JAVA\\Java_Study\\Day17\\1.txt");
        long lastModified = file.lastModified();
        System.out.println(lastModified);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(lastModified);
        System.out.println(format);

        System.out.println(file.length());
        System.out.println(new File("D:\\program\\JAVA\\Java_Study\\Day17\\ccc").length());
    }
}
