package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("olek");
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0;i<=10;i++)
        {
            intArrayList.add(i);
        }
        for(int i=0;i<=10;i++)
        {
            System.out.println(intArrayList.get(i));
        }

        ArrayList<Double> doubleList = new ArrayList<Double>();
        for(double i=0.0;i<=10.0;i+=0.5){
            doubleList.add(i);

        }
        for(int i=0;i<=10;i++)
        {
            System.out.println(doubleList.get(i));
        }
    }
}
