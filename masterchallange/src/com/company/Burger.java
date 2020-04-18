package com.company;

public class Burger {
    private double baseprice=10;
    private String breadRoll;
    private String meat;
    private int numberOfIngredients;
    private int counter;
    private boolean letuce;
    private boolean tomato;
    private boolean onion;
    private boolean bacon;
    private boolean mayo;
    private boolean chili;


    public Burger(String breadRoll, String meat) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.numberOfIngredients = 6;
        this.counter=2;
        this.letuce=false;
        this.tomato=false;
        this.bacon=false;
        this.onion=false;
        this.mayo=false;
        this.chili=false;


    }

    public double getBaseprice() {
        return baseprice;
    }

    public boolean isLetuce() {
        return letuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isMayo() {
        return mayo;
    }

    public boolean isChili() {
        return chili;
    }
    public void addToCounter(){
        this.counter+=1;
    }
    public void getPrice(){
        double price=baseprice;
        System.out.println("the base price is "+price);
        if(letuce){
            System.out.println("lettuce 1");
            price+=1;
            addToCounter();
        }
        if(tomato){
            System.out.println("tomato 1.5");
            price+=1.5;
            addToCounter();
        }
        if(bacon){
            System.out.println("bacon 3");
            price+=3;
            addToCounter();
        }
        if(onion){
            System.out.println("onion 1");
            price+=1;
            addToCounter();
        }
        if(mayo){
            System.out.println("mayo 2");
            price+=2;
            addToCounter();
        }
        if(chili){
            System.out.println("chili 3");
            price+=3;
            addToCounter();
        }

        System.out.println("the price with additions is "+price);

    }
    public int getCounter(){
        return counter;
    }
    public void addLetuce(){
        if (counter<6){
            this.letuce=true;
        }
        else
        {
            System.out.println("you cant add any more ingredints");
        }
    }
    public void addTomato(){
        if (counter<6){
            this.tomato=true;
        }
        else
        {
            System.out.println("you cant add any more ingredints");
        }
    }
    public void addBacon(){
        if (counter<6){
            this.bacon=true;
        }
        else
        {
            System.out.println("you cant add any more ingredints");
        }
    }
    public void addOnion(){
        if (counter<6){
            this.onion=true;
        }
        else
        {
            System.out.println("you cant add any more ingredints");
        }
    }
    public void addMayo(){
        if (counter<6){
            this.mayo=true;
        }
        else
        {
            System.out.println("you cant add any more ingredints");
        }
    }
    public void addChili(){
        if (counter<6){
            this.chili=true;
        }
        else
        {
            System.out.println("you cant add any more ingredints");
        }
    }



}
