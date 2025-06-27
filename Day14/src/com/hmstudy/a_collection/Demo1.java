package com.hmstudy.a_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("111");
        c.add("222");
        c.add("333");
        c.add("444");
        c.add("555");
        c.add("666");
        c.add("777");
        
        System.out.println(c);

        Iterator<String> iterator =  c.iterator();

        // System.out.println("当前Iterator是否可以继续运行：" + iterator.hasNext()); // 判断是否有下一个元素

        // System.out.println("获取Iterator的下一个元素：" + iterator.next());
        // System.out.println("获取Iterator的下一个元素：" + iterator.next());

        // iterator.remove(); // 删除当前元素
        // System.out.println(c);
        // iterator.remove(); // 删除当前元素
        // System.out.println(c);

        while(iterator.hasNext()){ // 判断是否有下一个元素
            iterator.next(); // 获取Iterator的下一个元素
            iterator.remove(); // 删除当前元素
        }

        System.out.println(c.isEmpty());

    }
}
