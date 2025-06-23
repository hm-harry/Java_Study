package com.hmstudy.b_interface;

interface F {
    default void testF() { // 缺省方法，实现类可以不实现
        System.out.println("默认方法，非强制实现");
    }
}

class TypeF implements F { // 实现类可以不实现默认方法，但是如果实现了，必须实现
}

public class Demo3 {
    public static void main(String[] args) {
        TypeF typeF = new TypeF();
        typeF.testF(); // 默认方法，非强制实现
    }
}
