package com.hmstudy.a_extends;
class Father {
    public void game() {
        System.out.println("玩游戏");
    }

    public void work() {
        System.out.println("工作");
    }
}

class Son extends Father {
    // 重写父类的方法
    // @Override 注解，检查重写的方法是否正确
    @Override
    public void game() {
        // 输出子类玩游戏的信息
        System.out.println("son玩游戏");
    }

    @Override
    public void work() {
        System.out.println("son工作");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Son son = new Son();
        son.game();
        son.work();
    }
}
