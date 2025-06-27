package com.hmstudy.a_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("111");
        c.add("222");
        c.add("333");
        c.add("444");
        c.add("555");
        c.add("666");
        c.add("777");

        Iterator<String> iterator = c.iterator();

        while (iterator.hasNext()) { // 判断是否有下一个元素
            System.out.println(iterator.next());

            c.remove("333");
        }
        
    }
}
