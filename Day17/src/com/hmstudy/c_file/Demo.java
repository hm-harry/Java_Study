package com.hmstudy.c_file;

import java.io.File;

public class Demo {
    File file = new File("D:\\program\\JAVA\\Java_Study\\Da17");
    File file2 = new File("D:\\program\\JAVA\\Java_Study"+ File.separator + "Da17", "aaa.txt");
    File file3 = new File(file, "bbb.txt"); 

}
