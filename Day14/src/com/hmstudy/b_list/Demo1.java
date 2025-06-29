package com.hmstudy.b_list;

import java.util.List;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        list.add("ggg");

        System.out.println(list);
        list.add(1, "111");
        
        System.out.println(list);

        List<String> list2 = new ArrayList<String>();

        list2.add("111");
        list2.add("222");
        list2.add("333");

        list.addAll(2, list2);

        System.out.println(list);

        System.out.println(list.remove(5));

        String str = list.set(1, "222");
        System.out.println(str);
        System.out.println(list);

        int index = list.indexOf("222");
        System.out.println(index);

        int lastIndex = list.lastIndexOf("222");
        System.out.println(lastIndex);

        List<String> sublist = list.subList(0, 5);
        System.out.println(sublist);
    }
}
