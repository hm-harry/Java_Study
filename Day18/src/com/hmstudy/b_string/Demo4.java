package com.hmstudy.b_string;

import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};

        String str1 = new String(arr);
        System.out.println(str1);

        String str2 = new String(arr, 1, 3);
        System.out.println(str2);

        String str3 = String.valueOf(arr);
        System.out.println(str3);

        String str4 = String.valueOf(arr, 1, 3);
        System.out.println(str4);

        char[] charArray = str1.toCharArray();
        System.out.println(Arrays.toString(charArray));
    }
}
