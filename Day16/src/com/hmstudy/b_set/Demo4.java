package com.hmstudy.b_set;

import java.util.TreeSet;

public class Demo4 {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>(new PersonComparator());

        Person person1 = new Person(1,"张三", 10.01);
        Person person2 = new Person(2,"李四", 10.02);
        Person person3 = new Person(3,"王五", 30);
        Person person4 = new Person(4,"赵六", 40);

        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);
        treeSet.add(person4);

        System.out.println(treeSet);

    }
}
