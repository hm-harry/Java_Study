package com.hmstudy.c;

interface USB {
    void connect(); // 抽象方法，必须实现

}

class Mouse implements USB {
    @Override
    public void connect() { // 实现抽象方法，必须实现
        System.out.println("鼠标连接USB接口");
    }
}

class Keyboard implements USB {
    @Override
    public void connect() { // 实现抽象方法，必须实现
        System.out.println("键盘连接USB接口");
    }
}

class PC {
    public void usbConnect(USB usb) {
        usb.connect(); // 调用实现类的方法
    }
}

class Logi extends Mouse {
    @Override
    public void connect() { // 实现抽象方法，必须实现
        System.out.println("罗技鼠标连接USB接口");
    }
}

class IKBC extends Keyboard {
    @Override
    public void connect() { // 实现抽象方法，必须实现
        System.out.println("IKBC键盘连接USB接口");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        PC pc = new PC();
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();

        pc.usbConnect(mouse);
        pc.usbConnect(keyboard);

        pc.usbConnect(new Logi()); // 接口多态，子类对象可以作为接口类型使用，向上转型
        pc.usbConnect(new IKBC()); // 接口多态，子类对象可以作为接口类型使用，向上转型
    }
}
