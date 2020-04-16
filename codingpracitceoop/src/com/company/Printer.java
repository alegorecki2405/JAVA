package com.company;

public class Printer {
    private double tonerLevel;
    private int numberOfPages;
    private boolean isADuplexPrinter;

    public Printer( boolean isADuplexPrinter) {
        this.tonerLevel = 0;
        this.numberOfPages = 0;
        this.isADuplexPrinter = isADuplexPrinter;
    }

    public void fillUp(){
        this.tonerLevel=100;

    }
    public void printPage(int number){
        if(number*0.01>tonerLevel){
            System.out.println("there is not enough toner in the printer");
        }
        else {
            this.numberOfPages+=number;
            this.tonerLevel-=number*0.01;
        }

    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isADuplexPrinter() {
        return isADuplexPrinter;
    }
}
