package com.system.student.hmstudy.manager;

import java.util.Scanner;

import com.system.student.hmstudy.compare.MyComparator;
import com.system.student.hmstudy.entity.Student;
import com.system.student.hmstudy.util.MyArrayList;

public class StudentManager {
    /**
     * 用于存储所有学生信息的数组
     */
    private MyArrayList<Student> allStus;


    public StudentManager() {
        allStus = new MyArrayList<Student>();
    }

    public StudentManager(int initCapacity) {
        allStus = new MyArrayList<Student>(initCapacity);
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
        return add(allStus.size(), student);
    }


    /**
     * 插入学生信息到指定位置
     * @param index 要插入的位置
     * @param student 要插入的学生信息
     * @return 插入成功返回true，插入失败返回false
     * @author 2024/8/24 10:47
     * */
    public boolean add(int index, Student student) {
        allStus.add(index, student);
        return true;
    }

    /**
     * 根据id删除学生信息
     * @param id 要删除的学生的id
     * @return 删除成功返回被删除的学生信息，删除失败返回null
     * 
     */
    public Student remove(int id) {
        int index = findIndexById(id);
        
        return allStus.remove(index);
    }


    /**
     * 根据id修改学生信息
     * @param id 要修改的学生的id
     * @return 修改成功返回true，修改失败返回false
     * @author 2024/8/24 10:47
     * 
     */
    public boolean modify(int id) {
        int index = findIndexById(id);
        if (index == -1) {
            // System.out.println("Input id is out of range");
            return false;
        }

        int choose = 0;
        // 退出标记
        boolean flag = false;
        // 键盘输入
        Scanner sc = new Scanner(System.in);
        // 修改学生信息
        Student stu = allStus.get(index);
        while (true) {
            // 展示当前Student类对象数据情况
            System.out.println("ID" + stu.getId());
            System.out.println("Name" + stu.getName() + " Age" + stu.getAge() + " Gender" + stu.getGender());
            System.out.println("MathScore" + stu.getMathScore() + " ChnScore" + stu.getChnScore() + " EngScore" + stu.getEngScore());
            System.out.println("TotalScore" + stu.getTotalScore() + " Rank" + stu.getRank());
            System.out.println("1. 修改学生姓名");
            System.out.println("2. 修改学生年龄");
            System.out.println("3. 修改学生性别");
            System.out.println("4. 修改学生数学成绩");
            System.out.println("5. 修改学生语文成绩");
            System.out.println("6. 修改学生英语成绩");
            System.out.println("7. 退出修改");
            System.out.println("请输入你的选择：");

            choose = sc.nextInt();
            // 清空缓冲区
            sc.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("请输入新的学生姓名：");
                    String name = sc.nextLine();
                    stu.setName(name);
                    break;
                case 2:
                    System.out.println("请输入新的学生年龄：");
                    int age = sc.nextInt();
                    stu.setAge(age);
                    break;
                case 3:
                    System.out.println("请输入新的学生性别：");
                    char gender = sc.nextLine().charAt(0);
                    stu.setGender(gender);
                    break;
                case 4:
                    System.out.println("请输入新的学生数学成绩：");
                    int mathScore = sc.nextInt();
                    stu.setMathScore(mathScore);
                    break;
                case 5:
                    System.out.println("请输入新的学生语文成绩：");
                    int chnScore = sc.nextInt();
                    stu.setChnScore(chnScore);
                case 6:
                    System.out.println("请输入新的学生英语成绩：");
                    int engScore = sc.nextInt();
                    stu.setEngScore(engScore);
                case 7:
                    System.out.println("退出修改");
                    flag = true;
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
            if (flag) {
                // 跳出循环结构
                break;
            }
        }

        return true;
    }

    /**
     * 根据id查找学生信息
     * @param id 要查找的学生的id
     * @return 查找成功返回返回值大于等于0的索引，查找失败返回-1
     * @author 2024/8/24 10:47
     * */
    public Student get(int id) {
        int index = findIndexById(id);
        if (index == -1) {
            // System.out.println("Input id is out of range");
            return null;
        }

        return allStus.get(index);
    }

    /**
     * 选择排序算法，但是需要依赖MyComparator接口来提供算法核心内容
     * @author 2024/8/24 10:48
     */
    public void selectSortUsingComparator(MyComparator com) {
        int size = allStus.size();
        Student[] sortTemp = new Student[size];

        for (int i = 0; i < size; i++) {
            sortTemp[i] = allStus.get(i);
        }

        // 选择排序
        for (int i = 0; i < sortTemp.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < sortTemp.length; j++) {
                // 两个学生年龄进行比较
                // if (sortTemp[j].getAge() > sortTemp[index].getAge()) {
                if (com.compare(sortTemp[index], sortTemp[j])) {
                    index = j;
                }
            }

            if (index != i) {
                Student temp = sortTemp[i];
                sortTemp[i] = sortTemp[index];
                sortTemp[index] = temp;
            }
        }

        // 展示排序后的学生信息
        for (int i = 0; i < sortTemp.length; i++) {
            System.out.println(sortTemp[i]);
        }
    }

    /**
     * 展示所有学生信息
     * @author 2024/8/24 10:48
     * */
    public void show() {
        for (int i = 0; i < allStus.size(); i++) {
            System.out.println(allStus.get(i));
        }
    }

    /**
     * 根据id查找学生信息
     * @param id 要查找的学生的id
     * @return 查找成功返回返回值大于等于0的索引，查找失败返回-1
     * @author 2024/8/24 10:47
     */
    private int findIndexById(int id) {
        if (id < 0) {
            System.out.println("Input id is out of range");
            return -1;    
        }

        // 查找要删除的学生信息
        int index = -1;

        int size = allStus.size();

        // 遍历数组，找到要删除的学生信息的索引
        for (int i = 0; i < size; i++) {
            if (allStus.get(i).getId() == id) {
                index = i;
                break;
            }
        }

        return index;
    }
}
