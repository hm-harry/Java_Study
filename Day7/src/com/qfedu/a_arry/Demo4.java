package com.qfedu.a_arry;

public class Demo4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, -1, 0, 5, 6, 0};
        int index = 7; // 要插入的位置
        int insertNum = 100; // 要插入的元素

        boolean result = addNum(arr, index, insertNum); // 调用addNum方法，将元素插入到数组中
        if (result) { // 如果插入成功，则输出插入后的数组
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]); // 输出插入后的数组
            }
        }
    }

    public static boolean addNum(int[] arr, int index, int insertNum) {
        if (index < 0 || index > arr.length) {
            System.out.println("Input Parameter is Invalid");
            return false;
        }

        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1]; // 将数组中index位置后面的元素向后移动一位
        }
        arr[index] = insertNum; // 将新元素插入到index位置

        return true;

    }
}
