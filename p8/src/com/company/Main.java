package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(76,2));
        System.out.println(getDurationString(4562));
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored :"+score+" points" );
        return score*1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored :"+score+" points" );
        return score*1000;
    }
    public static int calculateScore(){
        System.out.println("No player name , no play score" );
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet<0 || inches<0 || inches>12){
            return -1;
        }
        double centimeters = (feet*12)*2.54+inches*2.54;
        System.out.println(centimeters);
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            return -1;
        }
        double feet = (int) inches/12;
        double remainingInches = (int) inches % 12;
        System.out.println(feet+" and "+remainingInches);
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }

    public static String getDurationString(int minutes,int seconds){
        if (minutes < 0 || seconds <0 || seconds>59){
            return "Invalid Value";
        }
        int hours = minutes / 60;
        minutes = minutes %60;

        return hours+"h "+minutes+"m "+seconds+"s ";
    }
    public static String getDurationString(int seconds){
        if (seconds <0) {
            return "Invalid Value";
        }
        int minutes = seconds/60;
        seconds = seconds % 60;
        return getDurationString(minutes,seconds);

    }

}
