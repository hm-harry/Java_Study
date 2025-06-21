package com.hmstudy.c_car;

public class Tyre {
    private String name;
    private int size; // in inch
    public Tyre() {
    }
    public Tyre(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    
}
