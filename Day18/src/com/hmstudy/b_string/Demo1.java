package com.hmstudy.b_string;

public class Demo1 {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "hello world";
        String str3 = new String("hello world");
        String str4 = new String(str1);

        System.out.println(str1 == str2);
        System.out.println(str1 == str4);
        System.out.println(str1 == str3);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

    }
}
