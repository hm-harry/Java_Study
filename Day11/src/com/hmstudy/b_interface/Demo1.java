package com.hmstudy.b_interface;

interface A {
    // 缺省属性
    int num = 10; // public static final int num = 10
    
    // 缺省方法
    void test();
}

interface B {
    void testB();
}

class TypeA implements A,B {

    @Override
    public void test() {
        System.out.println(num);
        System.out.println("test in TypeA");
    }

    @Override
    public void testB() {
        System.out.println("testB in TypeA");
    }
    
}

public class Demo1 {
    public static void main(String[] args) {
        TypeA typeA = new TypeA();
        typeA.test();
    }
}
