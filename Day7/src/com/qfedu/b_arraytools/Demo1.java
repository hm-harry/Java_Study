package com.qfedu.b_arraytools;

import java.util.Arrays;
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10}; // 定义一个数组
        System.out.println(Arrays.toString(arr)); // 输出数组的内容，使用Arrays.toString()方法
        
        Arrays.sort(arr); // 对数组进行排序
        System.out.println(Arrays.toString(arr)); // 输出排序后的数组

        int index = Arrays.binarySearch(arr, 5);
        System.out.println(index); // 输出5在数组中的索引位置
    }


}
