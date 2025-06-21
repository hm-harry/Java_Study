package com.hmstudy.e_extends;

class LOLHero {
    public int hp;
    public int mp;

    public LOLHero() {
        System.out.println("这是LOLHero无参数的构造方法");
    }

    public LOLHero(int hp) {
        this.hp = hp;
        System.out.println("这是单参数的构造方法");
    }

    public LOLHero(int hp, int mp) {
        this.hp = hp;
        this.mp = mp;
        System.out.println("这是双参数的构造方法");
    }
}

class VN extends LOLHero {
    public VN() {
        super();
        System.out.println("这是VN的构造方法");
        // super(10, 20);
    }
}

public class Demo3 {
    public static void main(String[] args) {
        new VN();
    }
}
