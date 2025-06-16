package com.qfedu.a_arry;
import java.util.Arrays;

public class Demo6 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, -1, 0, 5, 2, 0};
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[index] < arr[i]) {
                index = i;
            }
        }
    
        if (index != 0) {
            int temp = arr[0];
            arr[0] = arr[index];
            arr[index] = temp;
        }

        System.out.println(Arrays.toString(arr));

        int index1 = 1;

        for (int i = 2; i < arr.length; i++) {
            if (arr[index1] < arr[i]) {
                index1 = i;
            }
        }

        if (index1 != 1) {
            int temp = arr[1];
            arr[1] = arr[index1];
            arr[index1] = temp;
        }
        System.out.println(Arrays.toString(arr));

        int index2 = 2;

        for (int i = 3; i < arr.length; i++) {
            if (arr[index2] < arr[i]) {
                index2 = i;
            }
        }

        if (index2 != 1) {
            int temp = arr[2];
            arr[2] = arr[index2];
            arr[index2] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
