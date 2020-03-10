package com.company;

public class Main {

    public static void main(String[] args) {
	    //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString = "this is my string";
        System.out.println("my string is equal to "+myString);
        myString+="and there is more";
        System.out.println(myString);
        myString+='\u00A9';
        System.out.println(myString);
        String numberString = "250.55";
        numberString+="49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString+myInt;
        System.out.println("last string is equal to " + lastString);

    }
}
