package com.hmstudy.b_objectProgram;
/**
 * main方法所在类
 */
public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Computer computer = new Computer();
        
        for (int i = 0; i < 10; i++) {
            computer.computerRunning();
            Thread.sleep(500);
        }
        computer.setSreenShow(false);
        System.out.println("电脑故障");

        for (int i = 0; i < 10; i++) {
            computer.computerRunning();
            Thread.sleep(500);
        }

        Factory factory = new Factory();
        factory.setName("联想专修");
        factory.setAddress("北京");
        factory.setTele("10086");

        factory.repair(computer);
        for (int i = 0; i < 10; i++) {
            computer.computerRunning();
            Thread.sleep(500);
        }
    }
}
