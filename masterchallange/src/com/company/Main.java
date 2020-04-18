package com.company;

public class Main {

    public static void main(String[] args) {
	    Burger burger= new Burger("white","chicken");

	    burger.addBacon();
	    burger.addChili();
	    burger.getPrice();

	    HealthyBurger healthy = new HealthyBurger("dick");
	    healthy.addAvocado();
	    healthy.addRocket();
	    healthy.getPrice();

	    DeluxeBurger deluxe = new DeluxeBurger("white","beef");
	    deluxe.addBacon();
	    deluxe.getPrice();


    }
}
