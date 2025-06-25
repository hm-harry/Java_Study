package com.hmstudy.a_throwable;

/*
 * NullPointerException  空指针异常
 */
public class Demo2 {
    public static void main(String[] args) {
        // int[] arr = null;

        // arr[0] = 10;

        test();
    }

    public static void test() {
        long[] arr = new long[1024 * 1024 * 1024 * 1024];
        arr[0] = 10;
    }
}
