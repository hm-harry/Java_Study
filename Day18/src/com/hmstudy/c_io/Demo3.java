package com.hmstudy.c_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        copyTest2();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "毫秒");
    }

    public static void copyTest1() {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // 1、创建文件输入字节流
            fis = new FileInputStream("D:\\program\\JAVA\\Java_Study\\Day18\\1.mp4");
            // 2、创建文件输出字节流
            fos = new FileOutputStream("D:\\program\\JAVA\\Java_Study\\Day18\\2.mp4");
            
            // 3、准备一个缓冲数组8KB
            byte[] buf = new byte[1024 * 8];
            int length = -1;

            // 4、读取数据文件
            while ((length = fis.read(buf)) != -1) {
                // 5、写入数据文件
                fos.write(buf, 0, length);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void copyTest2() {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // 1、创建文件输入字节流
            fis = new FileInputStream("D:\\program\\JAVA\\Java_Study\\Day18\\1.mp4");
            // 2、创建文件输出字节流
            fos = new FileOutputStream("D:\\program\\JAVA\\Java_Study\\Day18\\2.mp4");
            
            // 3、准备一个缓冲数组8KB
            int content = -1;

            // 4、读取数据文件
            while ((content = fis.read()) != -1) {
                // 5、写入数据文件
                fos.write(content);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
