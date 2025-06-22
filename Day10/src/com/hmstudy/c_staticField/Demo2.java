package com.hmstudy.c_staticField;

class Dog {
    public static String info = "狗";
    public String name;

    public Dog() {
        
    }
    public Dog(String name) {
        this.name = name;
    }
    public void test() {
        System.out.println("test方法");
    }
    
}
public class Demo2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("1");
        Dog dog2 = new Dog("2");
        Dog dog3 = new Dog("3");
        Dog dog4 = new Dog("4");
        Dog dog5 = new Dog("5");
        Dog dog6 = new Dog("6");
        Dog dog7 = new Dog("7");
        Dog dog8 = new Dog("8");

        System.out.println(Dog.info);

        dog1.info = "狗1";

        System.out.println(Dog.info);
    }
}
