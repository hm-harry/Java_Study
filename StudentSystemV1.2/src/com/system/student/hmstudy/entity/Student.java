package com.system.student.hmstudy.entity;

public class Student {
    // id具有唯一性
    private int id;
    private String name;
    private int age;
    private char gender;
    private int mathScore;
    private int chnScore;
    private int engScore;
    private int totalScore;
    private int rank;

    // 类对象计数器
    private static int count = 0;

    // 构造代码块
    {
        id = count++;
    }

    public Student() {
        
    }

    public Student(String name, int age, char gender, int mathScore, int chnScore, int engScore) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mathScore = mathScore;
        this.chnScore = chnScore;
        this.engScore = engScore;

        this.totalScore = mathScore + chnScore + engScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.totalScore -= this.mathScore;
        this.mathScore = mathScore;
        this.totalScore += this.mathScore;
    }

    public int getChnScore() {
        return chnScore;
    }

    public void setChnScore(int chnScore) {
        this.totalScore -= this.chnScore;
        this.chnScore = chnScore;
        this.totalScore += this.chnScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.totalScore -= this.engScore;
        this.engScore = engScore;
        this.totalScore += this.engScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", mathScore="
                + mathScore + ", chnScore=" + chnScore + ", engScore=" + engScore + ", totalScore=" + totalScore
                + ", rank=" + rank + "]";
    }

    
}
