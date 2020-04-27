package com.company;

public class Main {

    public static void main(String[] args) {
        Bank elbanko = new Bank();
        elbanko.addBranch("poor");
        elbanko.addBranch("rich");
        elbanko.addCustomerToBranch("poor","stasiek",-50.0);
        elbanko.addCustomerToBranch("rich","olek",10000);
        elbanko.addTransaction("rich","olek",-50);
        elbanko.getBranch("rich").showCustomers();
        
    }
}
