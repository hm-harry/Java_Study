package com.hmstudy.b_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("吴京", "谢楠");
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("黄晓明", "杨颖");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println(entrySet);
    }
}
