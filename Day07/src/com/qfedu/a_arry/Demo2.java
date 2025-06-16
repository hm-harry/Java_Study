package com.qfedu.a_arry;

public class Demo2 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, -1, 0, 5, 6, 4};
        int index = lastIndexOf(arr, 5);

        System.out.println("index: " + index);
    }


    // 返回数组arr中最后一个等于target的元素的索引，如果不存在则返回-1
    /**
     * 查找数组中最后一个等于target的元素的索引
     * @param arr 要查找的数组
     * @param target 要查找的目标元素
     * @return 返回数组中最后一个等于target的元素的索引，如果不存在则返回-1
     * 
     * */
    public static int lastIndexOf(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
