package com.hmstudy.b_anoymous;

interface A {
    void test();
}

class TypeA implements A {

    @Override
    public void test() {
        System.out.println("TypeA遵从A接口, 重写test方法");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        TypeA typeA = new TypeA();
        typeA.test();

        A a = new A() {
            @Override
            public void test() {
                System.out.println("匿名内部类遵从A接口, 重写test方法");
            }
        };

        a.test();

        new A() {
            @Override
            public void test() {
                System.out.println("匿名内部类的匿名对象直接调用方法");
            }
        }.test();

        testInterface(new A() {
            @Override
            public void test() {
                System.out.println("匿名内部类的匿名对象直接作为方法的参数");
            }
        });
    }

    public static void testInterface(A a) {
        a.test();
    }
}
