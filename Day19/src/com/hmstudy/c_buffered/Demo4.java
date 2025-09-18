package com.hmstudy.c_buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class Demo4 {
    public static void main(final String[] args) {
        
        
    }

    private static void getBr() {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(new File("E:\\study\\Java_Study\\Day19\\src\\com\\hmstudy\\b_io\\2.txt")));

            System.out.println(br.readLine());
            System.out.println(br.readLine());
        } catch (final IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (final IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
