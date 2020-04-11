package com.company;

public class Truck extends Car{
    private int loadAbility;

    public Truck(int engine, String name, String color, int speed, int wheelsize, int seets, int geer, int loadAbility) {
        super(engine, name, color, speed, wheelsize, seets, geer);
        this.loadAbility = loadAbility;
    }

    public int getLoadAbility() {
        return loadAbility;
    }

    public void setLoadAbility(int loadAbility) {
        this.loadAbility = loadAbility;
    }
    public void honk()
    {
        System.out.println("piiiiiibbbiiibiiiibbbpppp");
    }
}
