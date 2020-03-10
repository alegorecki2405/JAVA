package com.company;

public class Main {

    public static void main(String[] args) {
	    float myMinValue = Float.MIN_VALUE;
	    float myMaxValue = Float.MAX_VALUE;
        System.out.println(myMinValue);
        System.out.println((myMaxValue));

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println(myMinDouble);
        System.out.println((myMaxDouble));

        int myIntValue = 5 / 2;

        double myDoubleValue =5d /3d;

        float myFloatValue = 5f /3f;
        System.out.println("my int value =" + myIntValue);
        System.out.println("my float value =" + myFloatValue);
        System.out.println("my double value =" + myDoubleValue);

        double pounds = 200d;

        double kilograms = 0.45359237d*pounds;

        System.out.println(kilograms);

        double pi = 3.1415927d;


    }
}
