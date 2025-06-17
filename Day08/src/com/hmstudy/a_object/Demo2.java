package com.hmstudy.a_object;

class Dog {
    String name;
    int age;
    char gender;
}

public class Demo2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "aaa";
        dog1.age = 5;
        dog1.gender = '雄';

        System.out.println("name:" + dog1.name);
        System.out.println("age:" + dog1.age);
        System.out.println("gender:" + dog1.gender);

        dog2.name = "bbb";
        dog2.age = 15;
        dog2.gender = '雌';

        System.out.println("name:" + dog2.name);
        System.out.println("age:" + dog2.age);
        System.out.println("gender:" + dog2.gender);

        System.out.println("-------------------------------------");
        dog1 = dog2;

        dog1.name = "ccc";
        System.out.println("name:" + dog1.name);
        System.out.println("age:" + dog1.age);
        System.out.println("gender:" + dog1.gender);

        System.out.println("name:" + dog2.name);
        System.out.println("age:" + dog2.age);
        System.out.println("gender:" + dog2.gender);
    }
}
