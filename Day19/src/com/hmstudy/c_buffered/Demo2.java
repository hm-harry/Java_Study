package com.hmstudy.c_buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        // 创建缓冲输出流，包装文件输出流指向指定路径的文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("D:\\program\\JAVA\\Java_Study\\Day19\\src\\com\\hmstudy\\c_buffered\\2.txt")));
        
        for (int i = 0; i < 100000; i++) {
            bos.write('A');
        }
        bos.flush();

        bos.close();
    }
}
