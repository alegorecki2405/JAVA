package com.company;

public class Main {

    public static void main(String[] args) {
        int suma = 0;
        for(int i = 8;i>=2;i--){
            if(isPrime(i)){
                System.out.println(i);
                suma++;

            }
            if(suma==3)
            {
                break;
            }
        }
    }
    public static double calculateIntrest(double amount, double intrestRate){
        return(amount*intrestRate/100);
    }
    public static boolean isPrime(int n){
        if(n == 1)
        {
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
