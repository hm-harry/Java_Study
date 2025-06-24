package com.system.student.hmstudy.manager;

import com.system.student.hmstudy.entity.Student;

public class StudentManager {
    /**
     * 用于存储所有学生信息的数组
     */
    private Student[] allStus;

    /**
     * 数组的最大容量
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * 默认容量
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * 数组中实际存储的元素个数
     */
    private int size = 0;

    public StudentManager() {
        allStus = new Student[DEFAULT_CAPACITY];
    }

    public StudentManager(int initCapacity) {
        if (initCapacity <= 0 || initCapacity > MAX_ARRAY_SIZE) {
            System.out.println("超出合理范围，给予一个默认的初始化容量使用");
            allStus = new Student[DEFAULT_CAPACITY];
        } else{
            allStus = new Student[initCapacity];
        }
    }

    /**
     * 添加学生信息
     * @param student 要添加的学生信息
     * @return 添加成功返回true，添加失败返回false
     * @author 2024/8/24 10:47
     * */
    // 添加学生信息的方法
    public boolean add(Student student) {
        // 存储数据到数组的末尾
        add(size, student);
        return true;
    }


    /**
     * 插入学生信息到指定位置
     * @param index 要插入的位置
     * @param student 要插入的学生信息
     * @return 插入成功返回true，插入失败返回false
     * @author 2024/8/24 10:47
     * */
    public boolean add(int index, Student student) {
        if (index < 0 || index > size) {
            System.out.println("Input index is out of range");
            return false;
        }
        
        if (size == allStus.length) {
            // 扩容数组
            grow(size + 1);
        }

        for (int i = size; i > index; i--) {
            allStus[i] = allStus[i - 1];
        }

        allStus[index] = student;
        size++;
        return true;
    }

    /**
     * 根据id删除学生信息
     * @param id 要删除的学生的id
     * @return 删除成功返回被删除的学生信息，删除失败返回null
     * 
     */
    public Student remove(int id) {
        if (id < 0) {
            System.out.println("Input id is out of range");
            return null;    
        }

        // 查找要删除的学生信息
        int index = -1;

        // 遍历数组，找到要删除的学生信息的索引
        for (int i = 0; i < size; i++) {
            if (allStus[i].getId() == id) {
                index = i;
                break;
            }
        }

        Student stu = null;
        if (index >= 0) {
            // 保存要删除的学生信息
            stu = allStus[index];
            // 移动数组元素，将删除的学生信息后面的元素向前移动一位
            for (int i = index; i < size - 1; i++) {
                allStus[i] = allStus[i + 1];
            }
            allStus[size - 1] = null;
            size--;
        }
        
        return stu;
    }


    /**
     * 展示所有学生信息
     * @author 2024/8/24 10:48
     * */
    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(allStus[i]);
        }
    }

    /**
     * 扩容数组
     * @param minCapacity 最小容量
     * @author 2024/8/24 10:51
     * */
    private void grow(int minCapacity) {
        // 计算新容量
        int oldCapacity = allStus.length;
        // 新容量 = 旧容量 + 旧容量的一半
        int newCapacity = oldCapacity + (oldCapacity / 2);
        // 如果新容量小于最小容量，就使用最小容量
        if (minCapacity > newCapacity) {
            newCapacity = minCapacity;
        }

        // 扩容数组
        Student[] temp = new Student[newCapacity];

        // 将原数组中的元素复制到新数组中
        for (int i = 0; i < size; i++) {
            temp[i] = allStus[i];
        }

        // 将新数组赋值给原数组
        allStus = temp;
    }
}
