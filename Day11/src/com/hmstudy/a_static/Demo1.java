package com.hmstudy.a_static;

import java.util.Arrays;

class MyArrays {
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        
    }

}

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        MyArrays.reverse(arr);
        System.out.println(Arrays.toString(arr)); // [5, 4, 3, 2, 1]
    }
}