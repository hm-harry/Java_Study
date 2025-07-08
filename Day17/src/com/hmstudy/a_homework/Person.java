package com.hmstudy.a_homework;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private double salary;

    public Person() {}

    public Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }

        Person p = (Person) obj;
        System.out.println("equals方法被调用");
        return this.id == p.id && this.name.equals(p.name) && this.salary == p.salary;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode方法被调用");
        return Objects.hash(id, name, salary);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Person{" + "id=" + id + ", name=" + name + ", salary=" + salary + "}";
    }

    @Override
    public int compareTo(Person o) {
        System.out.println("CompareTo方法被调用");
        int ret = (int)((this.salary - o.salary) * 1000);

        return ret;
    }
}
