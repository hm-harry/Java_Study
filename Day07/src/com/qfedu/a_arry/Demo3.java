package com.qfedu.a_arry;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, -1, 0, 5, 6, 5};
        int[] indexArr = new int[arr.length]; // 用于存储索引的数组，长度与原数组相同

        int count = allIndexOf(arr, indexArr, 5);
        System.out.println("count: " + count); // 输出找到的元素的个数

        for (int i = 0; i < count; i++) {       
            System.out.println("index is: " + indexArr[i]); // 输出找到的元素的索引
        }
    }

    /**
     * 查找数组中所有等于target的元素的索引
     * @param arr 要查找的数组
     * @param indexArr 存储索引的数组
     * @param target 要查找的目标元素
     * 
     * @return 返回数组中所有等于target的元素的索引，如果不存在则返回-1
     * */

    public static int allIndexOf(int[] arr, int[] indexArr, int target) {
        if (arr.length > indexArr.length) {
            System.out.println("Input Parameter is Invalid");
            return 0;
        }

        int count = 0; // 记录找到的元素的个数
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                indexArr[count] = i; // 将找到的元素的索引存入indexArr数组中
                count++; // 找到一个元素，count加1
            }
        }
        return count;
    }
}
