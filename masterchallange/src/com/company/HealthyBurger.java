package com.company;

public class HealthyBurger extends Burger {

    private boolean avocado;
    private boolean rocket;
    public HealthyBurger( String meat) {
        super("brown rye bread roll", meat);
        this.addLetuce();
        this.addOnion();
    }
    public void addAvocado(){
        if (this.getCounter()<6){
            this.avocado=true;
        }
        else
        {
            System.out.println("you cant add any more ingredints");
        }
    }
    public void addRocket(){
        if (this.getCounter()<6){
            this.rocket=true;
        }
        else
        {
            System.out.println("you cant add any more ingredints");
        }
    }

    @Override
    public void getPrice() {
        double price=this.getBaseprice();
        System.out.println("the base price is "+price);
        if(this.isLetuce()){
            System.out.println("lettuce 1");
            price+=1;
            addToCounter();
        }
        if(isTomato()){
            System.out.println("tomato 1.5");
            price+=1.5;
            addToCounter();
        }
        if(isBacon()){
            System.out.println("bacon 3");
            price+=3;
            addToCounter();
        }
        if(isOnion()){
            System.out.println("onion 1");
            price+=1;
            addToCounter();
        }
        if(isMayo()){
            System.out.println("mayo 2");
            price+=2;
            addToCounter();
        }
        if(isChili()){
            System.out.println("chili 3");
            price+=3;
            addToCounter();
        }
        if(avocado){
            System.out.println("avocado 4");
            price+=4;
            addToCounter();
        }
        if(rocket){
            System.out.println("rocket 4");
            price+=4;
            addToCounter();
        }

        System.out.println("the price with additions is "+price);

    }
}
