package com.hmstudy.a_private;

/**
 * Private关键字使用
 * 
 */
class Dog {
    private String name; // 成员变量
    int age;
    char gender;

    public void testField() { // 成员方法
        name = "旺财"; // 可以访问name，因为是同一个类中的方法
        test();
    }

    private void test() {
        System.out.println("学习");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // dog.name = "旺财"; // 编译错误，name是私有的，外部类无法直接访问
        // dog.name = "旺财";

        dog.age = 3;
        dog.gender = '公';
        // dog.test(); // 编译错误，test是私有的，外部类无法直接访问
    }
}
