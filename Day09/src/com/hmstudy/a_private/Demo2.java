package com.hmstudy.a_private;

/**
 * 按照JavaBean的标准，完成自定义类
 */
class Cat {
    private String name;
    private int age;
    private char gender;
    private boolean married;
    public Cat() {
    }
    
    public Cat(String name, int age, char gender, boolean married) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.married = married;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public boolean isMarried() {
        return married;
    }
    
}

public class Demo2 {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setName("小花");
        cat.setAge(3);
        cat.setGender('公');
        cat.setMarried(false);

        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Gender: " + cat.getGender());
        System.out.println("Ismarried: " + cat.isMarried());
    }
}
