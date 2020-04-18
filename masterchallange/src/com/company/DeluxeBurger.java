package com.company;

public class DeluxeBurger extends Burger{
    public DeluxeBurger(String breadRoll, String meat) {
        super(breadRoll, meat);
        addToCounter();
        addToCounter();
        addToCounter();
        addToCounter();



    }

    @Override
    public void getPrice() {
        System.out.println("fries");
        System.out.println("cola");
        System.out.println("the price with additions is 30");
    }
}
