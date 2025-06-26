package com.hmstudy.a_genericity;

public class Demo1 {
    public static void main(String[] args) {
        Integer test = test(123);
        String test2 = test("hello");
        Demo1 test3 = test(new Demo1());

        String[] arr1 = {"111", "222", "333", "444", "555"};
        printArray(arr1);

        System.out.println("--------------------------------");

        Integer[] arr2 = {1, 2, 3, 4, 5};
        printArray(arr2);
    }


    public static <T> T test(T t) {
        return t;
    }

    /**
     * 
     * @param <T>
     * @param arr
     */
    public static <T> void printArray(T[] arr) {
        for (int i =  0; i < arr.length; i++) {
             System.out.println(arr[i]);
        }
    }
}
