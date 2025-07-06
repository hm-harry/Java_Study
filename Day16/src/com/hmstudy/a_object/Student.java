package com.hmstudy.a_object;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int age;
    private char gender;

    public Student() {}

    public Student(int id, String name, int age, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
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


    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public char getGender() {
        return gender;
    }



    public void setGender(char gender) {
        this.gender = gender;
    }

    // public boolean equals(Object obj) {
    //     if (this == obj) {
    //         return true;
    //     }

    //     if (!(obj instanceof Student)) {
    //         return false;
    //     }

    //     Student stu = (Student) obj;
    //     return this.id == stu.id && this.name.equals(stu.name) && this.age == stu.age && this.gender == stu.gender;
    // }

    @Override
    public String toString() {
        return "Student [id = " + id + ", name = " + name + ", age = " + age + ", gender = " + gender + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student stu = (Student) obj;
        return this.id == stu.id && this.name.equals(stu.name) && this.age == stu.age && this.gender == stu.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, gender);
    }

}
