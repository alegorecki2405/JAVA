package com.company;

public class Fish extends Animal{
    private int gils;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gils, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gils = gils;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }
    private void moveBackFin(){

    }
    private void moveMuscles(){

    }
    private void swim(int speed)
    {
        moveBackFin();
        moveMuscles();
        super.move(speed);
    }

}
