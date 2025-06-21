package com.hmstudy.b_array;

/*
 * 二分法查找
 */

public class Demo1 {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; // 有序数组
        int find = 13; // 要查找的元素
        int index = halfSearch(sortedArray, find);
        System.out.println(index);

    }

    /**
     * 二分法查找
     * 
     * @param sortedArray 有序数组
     * @param find        要查找的元素
     * @return 元素下标，-1代表没有找到
     */
    public static int halfSearch(int[] sortedArray, int find) {
        int minIndex = 0; // 最小下标
        int maxIndex = sortedArray.length - 1; // 最大下标
        int midIndex = (minIndex + maxIndex) / 2; // 中间下标

        while (minIndex <= maxIndex) {
            if(sortedArray[midIndex] == find) { // 找到了
                return midIndex;
            } else if(sortedArray[midIndex] > find) { // 找的数在左边
                maxIndex = midIndex - 1;
            } else { // 找的数在右边
                minIndex = midIndex + 1;
            }
            midIndex = (minIndex + maxIndex) / 2; // 更新中间下标
        }
        return -1;
        
    }
}
