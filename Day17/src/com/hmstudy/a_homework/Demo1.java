package com.hmstudy.a_homework;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        selectSort(arr);

        System.out.println(Arrays.toString(arr));

        Person person1 = new Person(1,"张三", 10.01);
        Person person2 = new Person(2,"李四", 10.02);
        Person person3 = new Person(3,"王五", 10.03);
        Person person4 = new Person(4,"赵六", 40);

        Person[] persons = {person1, person2, person3, person4};

        selectSort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                // TODO Auto-generated method stub
                BigDecimal bd1 =  new BigDecimal(o1.getSalary() + "");
                BigDecimal bd2 =  new BigDecimal(o2.getSalary() + "");

                // BigDecimal ret = bd1.subtract(bd2).multiply(new BigDecimal("100"));

                return bd2.compareTo(bd1); // 降序排列
            }
            
        });

        System.out.println(Arrays.toString(persons));

    }

    /**
     * 可以满足任意类型数据进行排序操作的算法，但是要求用户根据当前类型提供比较器对象
     * 
     * @param <T> 自定义泛型
     * @param arr 要排序的数组
     * @param comparator 比较器对象
     */
    public static <T> void selectSort(T[] arr, Comparator<T> comparator) {
        if (null == arr || arr.length == 0 || null == comparator) {
            throw new NullPointerException();    
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(arr[index], arr[j]) > 0) {
                    index = j;
                }
            }

            if (index != i) {
                T temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }

    public static void selectSort(int[] arr) {
        if (null == arr || arr.length < 0) {
            throw new NullPointerException();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if(arr[index] < arr[j]) {
                    index = j;
                }
            }
            if (index != i) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;    
            }
        }
    }
}
