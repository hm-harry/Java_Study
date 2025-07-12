package com.hmstudy.b_string;

public class Demo2 {
    public static void main(String[] args) {
        String str = "土豆牛肉土豆牛肉";
        System.out.println("str的长度是：" + str.length());

        System.out.println("str的第一个字符是：" + str.charAt(0));
        System.out.println("str的第四个字符是：" + str.charAt(3));

        System.out.println("" + str.indexOf('土'));
        System.out.println("" + str.indexOf('面'));
        System.out.println("" + str.indexOf("土豆"));

        System.out.println("" + str.indexOf('土', 1));
        System.out.println("" + str.indexOf('面', 1));

        System.out.println("" + str.lastIndexOf('土'));
        System.out.println("" + str.lastIndexOf('面'));
    }
}
