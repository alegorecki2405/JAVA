package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }
    public void createCustomer(double initialTransaction,String name){
        customers.add(new Customer(name,initialTransaction));
    }
    public void createCustomer(String name){
        new Customer(name);
    }
    public void addTransaction(String name,double amount){
        for (int i=0;i<customers.size();i++){
            if(customers.get(i).getName()==name){
                customers.get(i).addTransaction(amount);
            }
        }
    }
    public void showCustomers(){
        for (int i=0;i<customers.size();i++){
            System.out.println(customers.get(i).getName());
            customers.get(i).showTransaction();
            System.out.println();
        }
    }
    public Customer getCustomer(String name){
        int x = 0;
        for (int i=0;i<customers.size();i++){

            if(customers.get(i).getName()==name){
                x = i;
            }
        }
        return customers.get(x);
    }
}
