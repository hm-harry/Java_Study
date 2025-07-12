package com.hmstudy.c_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) {
        // 1、确定文件
        File file = new File("D:\\program\\JAVA\\Java_Study\\Day18\\src\\com\\hmstudy\\c_io\\b.txt");

        // 2、创建输出流对象
        FileOutputStream fileOutputStream = null;

        try {
            // 3、创建输出流对象，创建文件，删除写操作
            fileOutputStream = new FileOutputStream(file);

            byte[] bytes = "abcdabcd".getBytes();
            byte[] arr = {65, 66, 67, 68, 69, 70};


            fileOutputStream.write(bytes);
            fileOutputStream.write(arr, 2, 3);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
 
    }

    private static void getFileOutputStream() {
        // 1、确定文件
        File file = new File("D:\\program\\JAVA\\Java_Study\\Day18\\src\\com\\hmstudy\\c_io\\a.txt");
        
        // 2、创建输出流对象
        FileOutputStream fileOutputStream = null;

        try {
            // 3、创建输出流对象，创建文件，删除写操作
            // fileOutputStream = new FileOutputStream(file);

            // 3、创建输出流对象，创建文件，追加写操作
            fileOutputStream = new FileOutputStream(file, true);

            // 4、写出数据
            fileOutputStream.write('a');
            fileOutputStream.write('a');
            fileOutputStream.write('a');
            fileOutputStream.write('a');
            fileOutputStream.write('a');
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
