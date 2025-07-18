package com.system.student.hmstudy.test;

import org.junit.Test;

import com.system.student.hmstudy.entity.Student;
import com.system.student.hmstudy.manager.StudentManager;

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

    @Test
    public void testAdd() {
        StudentManager studentManager = new StudentManager();
        Student student1 = new Student("张三", 18, '男', 80, 90, 100);
        Student student2 = new Student("李四", 19, '女', 81, 91, 101);

        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.show();
    }
}
