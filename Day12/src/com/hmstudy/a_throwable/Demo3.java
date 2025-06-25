package com.hmstudy.a_throwable;

public class Demo3 {
    public static void main(String[] args) {
        test(10, 2, null);
    }

    public static void test(int num1, int num2, int[] arr) {
        int ret = 0;
        try {
            ret = num1 / num2;
            System.out.println("测试代码");
            arr[0] = 10;
        } catch (ArithmeticException e) {
            // System.out.println("除数不能为0");
            e.printStackTrace();
        } catch (NullPointerException e) {
            // System.out.println("数组不能为null");
            e.printStackTrace();
        }
        System.out.println("ret: " + ret);
    }
}
