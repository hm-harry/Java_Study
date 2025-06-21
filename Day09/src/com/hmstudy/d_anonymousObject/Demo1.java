package com.hmstudy.d_anonymousObject;

class Dog {
    String name;

    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println("Dog类的test方法");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "小黑";
        dog.test();

        new Dog("小黄").test(); // 匿名对象
        new Dog().name = "小红"; // 匿名对象
        System.out.println(new Dog().name); // 匿名对象

        testObject(dog);
        testObject(new Dog());
    }

    public static void testObject(Dog dog) {
        System.out.println(dog);
    }
}
