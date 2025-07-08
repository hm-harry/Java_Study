package com.hmstudy.b_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("吴京", "谢楠");
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("黄晓明", "杨颖");

        System.out.println(map);

        HashMap<String, String> map2 = new HashMap<String, String>();

        map2.put("Tom", "Jerry");
        map2.put("Jack", "Rose");
        map2.put("nezha","aobing");

        map.putAll(map2);
        System.out.println(map);

        System.out.println(map.remove("Tom"));
        System.out.println(map);

        System.out.println(map.remove("李晨", "范冰冰"));
        System.out.println(map);

        map.put("李晨", "123");
        System.out.println(map);

        System.out.println(map.containsKey("李晨"));
        System.out.println(map.containsKey("123"));

        System.out.println(map.containsValue("123"));
        System.out.println(map.containsValue("范冰冰"));

        Set<String> keySet = map.keySet();
        System.out.println(keySet);

        Collection<String> values = map.values();
        System.out.println(values);

    }
}
