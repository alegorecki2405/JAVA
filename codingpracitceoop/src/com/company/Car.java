package com.company;

public class Car extends Vehicle {
    private int wheelsize;
    private int seets;
    private int geer;

    public Car(int engine, String name, String color, int speed, int wheelsize, int seets, int geer) {
        super(engine, name, color, speed);
        this.wheelsize = wheelsize;
        this.seets = seets;
        this.geer = geer;
    }

    public int getWheelsize() {
        return wheelsize;
    }

    public void setWheelsize(int wheelsize) {
        this.wheelsize = wheelsize;
    }

    public int getSeets() {
        return seets;
    }

    public void setSeets(int seets) {
        this.seets = seets;
    }

    public int getGeer() {
        return geer;
    }

    public void setGeer(int geer) {
        this.geer = geer;
    }

    public void turn(String direction)
    {
        System.out.println("turning "+direction);
    }
    public void changeGeer(int num)
    {
        this.geer=num;
    }
    public  void changeSpeed(int num){
        this.setSpeed(num);
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("the car had stopped");
    }
}
