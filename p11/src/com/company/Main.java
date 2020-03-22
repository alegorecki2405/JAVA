package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        while ((count!=5)){
            System.out.println("the count is cuurently "+count);
            count++;
        }
        count =0;
        do
        {
            System.out.println("count value is "+count);
            count++;
        }
        while(count != 6);


        System.out.println(isEvenNumber(4));
    }

    public static boolean isEvenNumber(int a){
        if(a%2==0)
        {
            return true;
        }
        return false;
    }
}
