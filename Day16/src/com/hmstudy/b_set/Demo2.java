package com.hmstudy.b_set;

import java.util.HashSet;


public class Demo2 {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<Person>();

        Person person1 = new Person(1,"张三", 20);
        Person person2 = new Person(2,"李四", 10);
        Person person3 = new Person(3,"王五", 30);
        Person person4 = new Person(4,"赵六", 40);

        Person person5 = new Person(4,"赵七", 40);

        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);
        set.add(person5);

        System.out.println(set);

    }
}
