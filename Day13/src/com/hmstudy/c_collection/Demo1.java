package com.hmstudy.c_collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("111");
        c.add("222");
        c.add("333");
        c.add("444");

        Collection<String> c1 = new ArrayList<String>();

        c1.add("aaa");
        c1.add("bbb");
        c1.add("ccc");
        c1.add("ddd");

        c.addAll(c1);

        System.out.println(c);

        c.remove("222");

        System.out.println(c);

        // c.removeAll(c1);

        // System.out.println(c);

        // c.retainAll(c1);

        // System.out.println(c);

        System.out.println(c.size());

        // c.clear();

        System.out.println(c.isEmpty());

        System.out.println(c.contains("111"));
        System.out.println(c.contains("777"));

        System.out.println(c.containsAll(c1));

        c.add("555");

    }
}
