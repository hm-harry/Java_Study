package com.system.student.hmstudy.test;

import org.junit.Test;

import com.system.student.hmstudy.entity.Student;

public class SystemTest {
    @Test
    public void testStudent() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student("张三", 18, '男', 80, 90, 100);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
    }
}
