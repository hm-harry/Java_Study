package com.hmstudy.b_map;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo3 {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<String, String>();

        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");
        map.put("d", "D");

        System.out.println(map);

        TreeMap<Dog, String> map2 = new TreeMap<Dog, String>(new Comparator<Dog>() {

            @Override
            public int compare(Dog o1, Dog o2) {
                // TODO Auto-generated method stub
                return o1.getAge() - o2.getAge();
            }
            
        });

        map2.put(new Dog("旺财", 3), "111");
        map2.put(new Dog("小黄", 1), "222");
        map2.put(new Dog("豆豆", 2), "333");
        map2.put(new Dog("王可可", 4), "444");

        System.out.println(map2);
    }
}
