package com.hmstudy.e_staticBlock;

public class Demo3 {
    static Demo3 demo1 = new Demo3();
    static Demo3 demo2 = new Demo3();

    {
        System.out.println("构造代码块");
    }

    static {
        System.out.println("静态代码块");
    }

    public Demo3() {
        System.out.println("构造方法");
    }

    
    public static void main(String[] args) {
        // 创建Demo3类的实例
        Demo3 demo1 = new Demo3();
    }
}
