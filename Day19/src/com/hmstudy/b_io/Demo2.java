package com.hmstudy.b_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        
        try {
            fileReader = new FileReader("D:\\program\\JAVA\\Java_Study\\Day19\\src\\com\\hmstudy\\b_io\\1.mp4");
            fileWriter = new FileWriter("D:\\program\\JAVA\\Java_Study\\Day19\\src\\com\\hmstudy\\b_io\\2.mp4");

            char[] buf = new char[1024 * 4];
            int length = -1;

            while ((length = fileReader.read(buf)) != -1) {
                fileWriter.write(buf, 0, length);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }

            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }
        }
    }
}
