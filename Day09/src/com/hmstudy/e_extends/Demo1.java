package com.hmstudy.e_extends;

class Father {
    public String name; // name of the father
    private double salary;

    public Father() {
        System.out.println("Father constructor");
    }
    public Father(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void game() {
        System.out.println("I am playing game");
    }

    private void testprivate() {
        System.out.println("I am private method");
    }

}

class son extends Father {
    int age; // age of the son

    public son() {
        System.out.println("Son constructor");
    }
    public void work() {
        System.out.println("Son is working");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        son son = new son();
        son.age = 10;
        son.work(); // Son is working

        son.name = "Tom";
        son.game();
    }
}
