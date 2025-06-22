package com.hmstudy.e_staticBlock;

class Cat {
    static {
        System.out.println("Cat类的静态代码块");
    }
}
public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        // new Cat();
        // 强制加载Cat类，会执行Cat类的静态代码块
        Class.forName("com.hmstudy.e_staticBlock.Cat");
        
        System.out.println("=============");
    }
}
