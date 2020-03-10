package com.company;

public class Main {

    public static void main(String[] args) {
        //INTEGER
        int myValue = 1000;
        int myMin = Integer.MIN_VALUE;
        int myMax = Integer.MAX_VALUE;
        System.out.println(myMin);
        System.out.println(myMax);

        //wrapper class gives us ways to perform a operations on an int

        int myMaxIntTest = 2147483647;

        //BYTE

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        //SHORT

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);


        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);
        long bigLongLiteralNumber = 2_147_483_647_284L;
        System.out.println(bigLongLiteralNumber);
        short bigShortLiteralValue = 32767;

        int myTotal = (myMin/2);
        byte myNewByteValue = (byte)(myMinByteValue/2);

        short myNewShortValue = (short)(myMinShortValue/2);
        // casting converting types in JAVA

        //challange

        short shortNum = 21;
        byte byteNum = 4;
        int intNum = 20003;

        long longChallange = 50000* 10*(shortNum+byteNum+intNum);
        System.out.println("The result of my primitive types challange = " + longChallange);

    }
}
