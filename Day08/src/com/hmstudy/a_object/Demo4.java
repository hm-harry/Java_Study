package com.hmstudy.a_object;

class MyDog {
    public MyDog() {
        System.out.println("constructor: " + this);
    }
    public void test() {
        System.out.println("method: " + this);
    }
}

public class Demo4 {
    public static void main(String[] args) {
        MyDog dog1 = new MyDog();
        System.out.println("Instance of dog1: " + dog1);
        dog1.test();
    }
}
