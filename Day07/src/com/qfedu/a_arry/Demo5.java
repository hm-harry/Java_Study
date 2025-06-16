package com.qfedu.a_arry;

public class Demo5 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, -1, 0, 5, 6, 0};
        int index = 6; // 要删除的位置

        boolean result = deleteNum(arr, index); // 调用deleteNum方法，删除数组中指定索引位置的元素
        if (result) {
            System.out.println("删除成功");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            } 
        }
    }
    
    /**
     * 删除数组中指定索引位置的元素
     * @param arr 要删除元素的数组
     * @param index 要删除的元素的索引
     * @return
     */
    public static boolean deleteNum(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Input Parameter is Invalid");
            return false;
        }

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;

        return true;
    }
}
