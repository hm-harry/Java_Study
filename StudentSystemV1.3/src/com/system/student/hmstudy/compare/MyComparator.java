package com.system.student.hmstudy.compare;

import com.system.student.hmstudy.entity.Student;

public interface MyComparator {
    /**
     * 比较两个学生类型
     * @param stu1 第一个学生
     * @param stu2 第二个学生
     * @return 如果满足条件返回true，否则返回false
     */
    boolean compare(Student stu1, Student stu2);
}
