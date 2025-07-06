package com.hmstudy.b_set;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        System.out.println("Comparator的compare方法被调用");
        int ret = (int)((o1.getSalary() - o2.getSalary()) * 100);
        return ret;
    }
    
}
