package com.hmstudy.b_string;

import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("abcdabcdabcd".replace('a', 'A'));
        System.out.println("abcdabcdabcd".replaceFirst("ab", "AB"));

        String[] split = "A,B,C,D,E,F,G".split(",");
        System.out.println(Arrays.toString(split));

        System.out.println("ABCDEFG".substring(2));
        System.out.println("ABCDEFG".substring(2, 5));

        System.out.println("abcdefg".toUpperCase());
        System.out.println("ABCDEFG".toLowerCase());

        // 处理标题
        System.out.println("              abcdefg                    abcdefg         ".trim());
    }
}
