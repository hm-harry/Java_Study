package com.hmstudy.b_set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo5 {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                System.out.println("匿名内部类的compare方法被调用");
                int ret = (int)((o1.getSalary() - o2.getSalary()) * 100);
                return ret;
            }
            
        });

        Person person1 = new Person(1,"张三", 20);
        Person person2 = new Person(2,"李四", 10);
        Person person3 = new Person(3,"王五", 30);
        Person person4 = new Person(4,"赵六", 40);

        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);
        treeSet.add(person4);

        System.out.println(treeSet);
    }
}
