package com.hmstudy.D_staticMethod;

class TestStatic {
    public String name;

    public static int num = 10;

    public TestStatic() {
    }

    public static void staticMethod() {
        num = 20;
        // name = "abc"; // 错误
        // test();

        System.out.println("静态方法");
    }

    public void test() {
        System.out.println("普通方法");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        TestStatic ts = new TestStatic();

        // ts.staticMethod();
        TestStatic.staticMethod();
    }
}
