package com.company;

public abstract class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+" is eating");
    }

    @Override
    public void breathe() {
        System.out.println("breathe in, breathe out repeat");
    }

    public abstract void walk();

}
