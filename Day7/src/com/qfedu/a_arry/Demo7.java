package com.qfedu.a_arry;
import java.util.Arrays;

public class Demo7 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, -1, 0, 5, 2, 0}; // 定义一个数组
        selectSort(arr); // 调用选择排序方法
        
        System.out.println(Arrays.toString(arr)); // 输出排序后的结果
    }

    /**
     * 选择排序
     * @param arr 要排序的数组
     * 
     */
    public static void selectSort(int[] arr) { // 选择排序
        for (int i = 0; i < arr.length - 1; i++) { // 外层循环控制排序轮数，每一轮选出一个最大的元素
            int index = i; // 假设当前元素是最大的
            for (int j = i + 1; j < arr.length; j++) { // 内层循环控制每一轮比较的次数
                if (arr[index] > arr[j]) { // 如果当前元素大于后面的元素，则交换位置
                    index = j; // 更新最大元素的索引
                }
            }
            if (index != i) { // 如果最大元素的索引不是当前元素的索引，则交换位置
                int temp = arr[i]; // 交换位置
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }
}
