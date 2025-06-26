package com.system.student.hmstudy.compare.impl;

import com.system.student.hmstudy.compare.MyComparator;
import com.system.student.hmstudy.entity.Student;

public class MathScoreAscCompare implements MyComparator{
    @Override
    public boolean compare(Student stu1, Student stu2) {
        return stu1.getMathScore() > stu2.getMathScore(); // 如果满足条件返回true，否则返回false
    }
}
