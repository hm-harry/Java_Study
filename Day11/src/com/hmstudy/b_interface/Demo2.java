package com.hmstudy.b_interface;

interface C {
    void testC();
}

interface D {
    void testD();
}

interface E extends C, D { // 接口可以多继承

    void testE();
}

class TypeE implements E {

    @Override
    public void testC() {
        System.out.println("C协议");
    }

    @Override
    public void testD() {
        System.out.println("D协议");
    }

    @Override
    public void testE() {
        System.out.println("E协议");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        TypeE typeE = new TypeE();
        typeE.testC();
        typeE.testD();
        typeE.testE();
    }
}
