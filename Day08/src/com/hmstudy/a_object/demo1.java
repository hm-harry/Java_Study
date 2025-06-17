// 由于报错提示声明的包与预期包不匹配，若预期包为空，则移除包声明
// 注释原包声明，若后续需要可恢复
package com.hmstudy.a_object;

class Person {
    // 姓名
    String name;
    // 年龄
    int age;
    // 性别
    char gender;

    // 使用方法描述Person类的吃饭行为
    public void eat(String food) {
        System.out.println("吃" + food);
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void study() {
        System.out.println("学习");
    }
}

public class demo1 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);

        Person person1 = new Person();
        System.out.println(person1);

        person.name = "wuhm";
        person.age = 16;
        person.gender = '男';

        System.out.println("name:" + person.name);
        System.out.println("age:" + person.age);
        System.out.println("gender:" + person.gender);

        person.eat("烤羊排");
        person.sleep();
        person.study();
    }
}
