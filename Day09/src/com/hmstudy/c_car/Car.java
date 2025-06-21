package com.hmstudy.c_car;

public class Car {

    // 定义汽车类
    private Engine engine; // 定义发动机属性
    private Tyre tyre; // 定义轮胎属性

    public Car() {
        
        // 无参构造方法
    }
    public Car(Engine engine, Tyre tyre) {
        // 有参构造方法
        this.engine = engine;
        this.tyre = tyre;
    }

    public Engine getEngine() {
        // 获取发动机信息
        return engine;
    }

    public void setEngine(Engine engine) {
        // 设置发动机信息
        this.engine = engine;
    }

    public Tyre getTyre() {
        // 获取轮胎信息
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        // 设置轮胎信息
        this.tyre = tyre;
    }

    public void show() {
        // 显示汽车信息
        System.out.println("汽车信息如下：");
        System.out.println("发动机信息：" + engine.getName() + "，排量：" + engine.getCapacity() + "L");
        System.out.println("轮胎信息：" + tyre.getName() + "，尺寸：" + tyre.getSize() + "英寸");
    }
}
