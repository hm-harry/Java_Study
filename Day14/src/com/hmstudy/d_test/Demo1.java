package com.hmstudy.d_test;

import com.hmstudy.c_util.MyArrayList;

public class Demo1 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<String>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        MyArrayList<String> list2 = new MyArrayList<String>();

        list2.add("111");
        list2.add("222");
        list2.add(0, "333");
        list2.add("444");

        list.addAll(2, list2);

        System.out.println(list);
        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);

        list.addAll(list2);
        list.addAll(list2);
        System.out.println(list);

        System.out.println(list.contiansAll(list2));

        MyArrayList<String> list3 = new MyArrayList<String>();

        System.out.println(list.contiansAll(list3));

        list.remove(3);
        System.out.println(list);

        list.remove("111");
        System.out.println(list);

        System.out.println(list.contains("111"));
        System.out.println(list.contains("555"));

        System.out.println(list.get(0));

        System.out.println(list.size());

        System.out.println(list.lastIndexOf("444"));

        MyArrayList<String> list4 = list.subList(0, 5);
        System.out.println(list4);

        System.out.println(list.set(0, "hello"));
        System.out.println(list);

        
    }
}
