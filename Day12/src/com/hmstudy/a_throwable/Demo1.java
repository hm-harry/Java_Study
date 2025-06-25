package com.hmstudy.a_throwable;

public class Demo1 {
    public static void main(String[] args) {
        Throwable throwable = new Throwable("Dog");

        // System.out.println(throwable.getMessage()); // null
        // System.out.println(throwable.toString()); // java.lang.Throwable
        // throwable.printStackTrace(); // 异常的追踪栈信息

        test();
    }

    public static void test() {
        new Throwable("异常测试").printStackTrace();;
    }
}
