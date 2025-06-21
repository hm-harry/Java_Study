package com.hmstudy.c_car;

public class Engine {
    private String name; // name of the engine
    private float capacity; // capacity of the engine in liters

    public Engine() {
        
    }
    public Engine(String name, float capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }
    public String getName() {
        return name;
    }
    public float getCapacity() {
        return capacity;
    }
}
