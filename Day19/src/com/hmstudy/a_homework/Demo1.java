package com.hmstudy.a_homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(new File("D:\\program\\JAVA\\Java_Study\\Day19\\src\\com\\hmstudy\\a_homework\\1.txt"));

            int[] counts = new int[52];
            char[] buf = new char[1024];

            int length = -1;

            length = fileReader.read(buf);

            for (int i = 0; i < length; i++) {
                if (buf[i] >= 'A' && buf[i] <= 'Z') {
                    counts[buf[i] - 'A']++;
                } else if (buf[i] >= 'a' && buf[i] <= 'z') {
                    counts[buf[i] - 'a' + 26]++;
                }
            }

            System.out.println(Arrays.toString(counts));

            fileReader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
