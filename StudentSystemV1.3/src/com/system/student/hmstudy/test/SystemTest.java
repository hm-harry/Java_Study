package com.system.student.hmstudy.test;

import org.junit.Test;

import com.system.student.hmstudy.compare.MyComparator;
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

    @Test
    public void testInsert() {
        StudentManager studentManager = new StudentManager();

        Student student1 = new Student("张三", 18, '男', 80, 90, 100);
        Student student2 = new Student("李四", 19, '女', 81, 91, 101);

        studentManager.add(student1);
        studentManager.add(student2);

        studentManager.add(1, new Student("王五", 20, '男', 82, 92, 102));
        studentManager.show();
    }

    @Test
    public void testRemove() {
        StudentManager studentManager = new StudentManager();

        Student student1 = new Student("张三", 18, '男', 80, 90, 100);
        Student student2 = new Student("李四", 19, '女', 81, 91, 101);
        Student student3 = new Student("王五", 20, '男', 82, 92, 102);

        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.add(student3);

        System.out.println(studentManager.remove(2));

        studentManager.show();
    }

    @Test
    public void testModify() {
        StudentManager studentManager = new StudentManager();

        Student student1 = new Student("张三", 18, '男', 80, 90, 100);
        Student student2 = new Student("李四", 19, '女', 81, 91, 101);
        Student student3 = new Student("王五", 20, '男', 82, 92, 102);

        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.add(student3);

        studentManager.modify(2);

        studentManager.show();
    }

    @Test
    public void testGet() {
        StudentManager studentManager = new StudentManager();

        Student student1 = new Student("张三", 18, '男', 80, 90, 100);
        Student student2 = new Student("李四", 19, '女', 81, 91, 101);
        Student student3 = new Student("王五", 20, '男', 82, 92, 102);

        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.add(student3);

        System.out.println(studentManager.get(2));
    }

    @Test
    public void testSort() {
        StudentManager studentManager = new StudentManager();

        Student student1 = new Student("张三", 52, '男', 80, 90, 100);
        Student student2 = new Student("李四", 19, '女', 81, 91, 101);
        Student student3 = new Student("王五", 20, '男', 82, 92, 102);

        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.add(student3);

        // 使用匿名内部类实现比较器
        studentManager.selectSortUsingComparator(new MyComparator() {
            @Override
            public boolean compare(Student stu1, Student stu2) {
                return stu1.getMathScore() > stu2.getMathScore();
            }
        });
    }
}
