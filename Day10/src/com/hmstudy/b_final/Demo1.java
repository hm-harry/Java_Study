package com.hmstudy.b_final;

final class A {
    // final修饰的属性，一旦赋值后，不能修改
    public final String name = "张三";

    public final void testA() {
        System.out.println("A类的testA方法");
    }
}

// class B extends A {
    // @Override
    // public void testA() {
    //     System.out.println("B类的testA方法");
    // }
// }

public class Demo1 {
    public static void main(String[] args) {
        final int num; // 局部变量，栈内存，随方法调用而创建，随方法调用而销毁，方法执行完，num就销毁了
        num = 20;
        // num = 30; // 报错，不能修改final修饰的局部变量的值
        System.out.println(num); // 20
    }
}
