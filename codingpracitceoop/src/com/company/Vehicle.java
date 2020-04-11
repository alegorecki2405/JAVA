package com.company;

public class Vehicle {
    private int engine;
    private String name;
    private String color;
    private int speed;

    public Vehicle(int engine, String name, String color, int speed) {
        this.engine = engine;
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void stop(){
        System.out.println("the vehicle had stoped");
        this.speed=0;
    }
}
