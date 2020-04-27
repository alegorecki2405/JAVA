package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();


    public Customer(String name) {
        this.name = name;
    }
    public Customer(String name,double initialTransaction) {
        this.name = name;
        transactions.add(initialTransaction);
    }

    public void addTransaction(double value){
        transactions.add(value);
    }

    public String getName() {
        return name;
    }
    public void showTransaction(){
        for (int i=0;i<transactions.size();i++){
            System.out.print(","+transactions.get(i));
        }
    }

}
