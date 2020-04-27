package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();
    public void addBranch(String branchName){
        branches.add(new Branch(branchName));
    }
    public void addCustomerToBranch(String branchName,String customerName,double initialTransaction)
    {
        for (int i=0;i<branches.size();i++){
            if(branches.get(i).getBranchName()==branchName){
                branches.get(i).createCustomer(initialTransaction,customerName);
            }
        }
    }
    public void addCustomerToBranch(String branchName,String customerName)
    {
        for (int i=0;i<branches.size();i++){
            if(branches.get(i).getBranchName()==branchName){
                branches.get(i).createCustomer(customerName);
            }
        }
    }
    public void addTransaction(String branchName,String customerName,double amount){
        for (int i=0;i<branches.size();i++){
            if(branches.get(i).getBranchName()==branchName){
                branches.get(i).addTransaction(customerName,amount);
            }
        }
    }
    public Branch getBranch(String name){
        int x = 0;
        for (int i=0;i<branches.size();i++){

            if(branches.get(i).getBranchName()==name){
                x = i;
            }
        }
        return branches.get(x);
    }
}
