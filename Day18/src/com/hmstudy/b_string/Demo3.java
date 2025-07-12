package com.hmstudy.b_string;

public class Demo3 {
    public static void main(String[] args) {
        String str1 = "红烧茄子";

        boolean ret = str1.endsWith("茄子");
        System.out.println(ret);

        boolean ret2 = str1.isEmpty();
        System.out.println(ret2);
        System.out.println("".isEmpty());

        System.out.println("ABCDEFG".contains("AB"));
        System.out.println("ABCDEFG".contains("ab"));

        System.out.println("ABCD".equals("ABCD"));
        System.out.println("ABCD".equalsIgnoreCase("abcd"));
    }
}
