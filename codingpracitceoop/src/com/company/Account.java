package com.company;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account()
    {
        this("12",343,"bld","blahhhh","dick");
    }
    public Account(String number,double balance,String customerName,String customerEmailAddress, String customerPhoneNumber)
    {

    }

    public void deposit(double depositAmount)
    {
        balance += depositAmount;
    }
    public void withdrawl(double withdrawlAmount)
    {
        if(balance>=withdrawlAmount)
        {
            balance-=withdrawlAmount;
        }
        else
        {
            System.out.println("cannot withdrawl the money there is not enough on your bank account");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

