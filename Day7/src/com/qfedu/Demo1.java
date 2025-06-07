package com.qfedu;

public class Demo1 {
    /**
     * main方法
     * 
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, -1, 0, 5, 6, 4};
        int minIndex = minIndex(arr);
        System.out.println("min index: " + minIndex);
    }

    /**
     * 求数组中最小值的索引
     *
     * @param arr int类型数组
     * @return 最小值所在的下标位置
     * 
     * */
    public static int minIndex(int[] arr) {
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
