package com.hmstudy.e_extends;

class Animal {
    public String name = "动物"; // name of the animal

    public void eat() {
        System.out.println("Animal类的eat方法");
    }
}

class Dog extends Animal {
    public String name = "狗"; // name of the dog

    public void eat() {
        System.out.println("Dog类的eat方法");
    }

    public void test() {
        System.out.println(name); // 狗
        System.out.println(super.name); // 动物

        eat(); // Dog类的eat方法
        super.eat(); // Animal类的eat方法
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.test(); // 狗
    }
}
