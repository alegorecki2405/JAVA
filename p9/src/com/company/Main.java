package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 1;

        switch (value){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was 3 or 4 or 5");
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }

    }
    public static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Synday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;

        }
    }
}
