package com.company;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth= teeth;
        this.coat= coat;
    }
    private void chew(){
        System.out.println("Dog chews");
    }

    @Override
    public void eat() {
        System.out.println("dog eating called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("the dog is walking");
        super.move(5);
    }
    public void run(){
        System.out.println("the dog is running");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("dog is moving his legs");
    }
    @Override
    public void move(int speed) {
        System.out.println("dog move method called");
        moveLegs(speed);
        super.move(speed);
    }
}
