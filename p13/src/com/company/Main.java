package com.company;

public class Main {

    public static void main(String[] args) {
	int[] myVar = new int[10];
	myVar[5] = 50;
	double[] my2Var = {1,2,3,4,5,6,7,8,9,10};

    printArray(my2Var);


    }

    public static void printArray(double[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
