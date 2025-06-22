package com.hmstudy.e_staticBlock;

class MyDog {
    private String name;
    
    {
        System.out.println("代码块");
    }

    public MyDog() {
        System.out.println("无参构造方法");
    }

    public MyDog(String name) {
        this.name = name;
        System.out.println("有参构造方法");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        MyDog dog = new MyDog();
        MyDog dog2 = new MyDog("旺财");
    }
}
