package com.system.student.hmstudy.compare.impl;

import com.system.student.hmstudy.compare.MyComparator;
import com.system.student.hmstudy.entity.Student;

public class chnScoreAscCompare implements MyComparator{
    @Override
    public boolean compare(Student stu1, Student stu2) {
        return stu1.getChnScore() > stu2.getChnScore(); // 如果满足条件返回true，否则返回false
    }
}
