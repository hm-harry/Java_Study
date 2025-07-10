package com.hmstudy.a_homework;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\program\\JAVA\\Java_Study\\Day18\\src");

        File toBeCreateDir = null;

        // 判断是否是文件夹
        if (!file.isDirectory()) {
            return;
        }

        // 判断是否归档完成，不需要归档.
        if(new File(file, "1.lock").exists()) {
            return;
        }

        // 遍历文件夹
        File[] listFiles = file.listFiles();
        
        for (File srcFile : listFiles) {
            // 如果是普通文件，获取文件后缀名
            if (srcFile.isFile()) {
                String fileName = srcFile.getName();
                String upperSuffix = fileName.substring(fileName.lastIndexOf('.') + 1).toUpperCase();
                toBeCreateDir = new File(file, upperSuffix);
            } else {
                toBeCreateDir = new File(file, "subDir");
            }

            // 创建文件夹
            toBeCreateDir.mkdir();

            // 移动文件或文件夹
            srcFile.renameTo(new File(toBeCreateDir, srcFile.getName()));
        }

        new File(file, "1.lock").createNewFile(); // 创建锁文件
    }
}
