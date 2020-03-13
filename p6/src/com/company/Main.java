package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1+2; // 1+2=3
        System.out.println("1+2 = "+result);
        int previousResult = result;
        System.out.println(previousResult);
        result -= 1;
        System.out.println(result);
        System.out.println(previousResult);
        result *= 10;
        System.out.println("2*10 =" + result);
        // modulus

        result = 4 %3;
        System.out.println(result);

        //Abbreviating operators

        result = result++;
        System.out.println(result);
        result = result--;
        System.out.println(result);

        result+=2;
        System.out.println(result);
        result*= 10;
        System.out.println(result);

        result /= 3;
        System.out.println(result);

        boolean isAlien =  false;

        if (isAlien == true) {
            System.out.println("it is not an ailen");
            System.out.println("and i am scared of ailens");
        }
        int topScore = 80;
        if (topScore >= 100){
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater then top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("either or both of conditions are true");
        }
        int newValue = 50;
        if (newValue == 50){
            System.out.println("i fixed it as i was writing it");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("this is not supposed to happen");
        }

        boolean wasCar  = isCar ? true : false;
        if (wasCar) {
            System.out.println("wascar equals true");
        }

        //operators challange
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double thirdValue = ((firstValue+secondValue)*100.00d)%40.00d;

        boolean x = (thirdValue==0) ? true : false;

        System.out.println(x);

        if (!x){
            System.out.println("Got some remeinder");
        }

    }
}
