package com.hmstudy.a_extends;

abstract class LOLHero {
    abstract public void Q();
    abstract public void W();
    abstract public void E();
    abstract public void R();
}

class Yasuo extends LOLHero {
    @Override
    public void Q() {
        System.out.println("斩钢闪");
    }

    @Override
    public void W() {
        System.out.println("风之壁障");
    }

    @Override
    public void E() {
        System.out.println("踏前斩");
    }

    @Override
    public void R() {
        System.out.println("狂风绝息斩");
    }
    
}

class Garen extends LOLHero {

    @Override
    public void Q() {
        System.out.println("致命打击");
    }

    @Override
    public void W() {
        System.out.println("勇气");
    }

    @Override
    public void E() {
        System.out.println("审判");
    }

    @Override
    public void R() {
        System.out.println("德玛西亚正义");
    }
    
}

public class Demo2 {
    public static void main(String[] args) {
        Yasuo yasuo = new Yasuo();

        yasuo.Q();
        yasuo.W();
        yasuo.E();
        yasuo.R();

        Garen garen = new Garen();

        garen.Q();
        garen.W();
        garen.E();
        garen.R();

        // LOLHero lolHero = new LOLHero();
    }
}
