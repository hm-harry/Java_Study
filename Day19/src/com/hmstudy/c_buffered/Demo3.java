package com.hmstudy.c_buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class Demo3 {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        useBuffered();
        // copy();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - starttime);
    }

    public static void useBuffered() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(new File("D:\\program\\JAVA\\Java_Study\\Day19\\src\\com\\hmstudy\\c_buffered\\1.txt")));
            bos = new BufferedOutputStream(new FileOutputStream(new File("D:\\program\\JAVA\\Java_Study\\Day19\\src\\com\\hmstudy\\c_buffered\\buffered.txt")));

            int content = -1;
            
            while ((content = bis.read()) != -1) {
                bos.write(content);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    public static void copy() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("D:\\program\\JAVA\\Java_Study\\Day19\\src\\com\\hmstudy\\c_buffered\\1.txt");
            fos = new FileOutputStream("D:\\program\\JAVA\\Java_Study\\Day19\\src\\com\\hmstudy\\c_buffered\\copy.txt");
            
            int content = -1;
            while ((content = fis.read()) != -1) {
                fos.write(content);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
       


    }
}
