package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int bonus = 100;
        int levelcompleted = 5;

        int highScore =  calculateScore(gameOver,score,bonus,levelcompleted);

        calculateScore(true , 10000, 8 , 200);

        displayHighScore("olek", calculateHighScorePosition(1500));
        displayHighScore("kamil", calculateHighScorePosition(900));
        displayHighScore("michał", calculateHighScorePosition(400));
        displayHighScore("bartek", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int bonus, int levelcompleted){
        if(gameOver == true){
            int finalScore = score +(levelcompleted*bonus);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScore(String name,int position){
        System.out.println(name + " managed to get into position "+ position + " on a highscore table");
    }

    public static int calculateHighScorePosition(int score){
        if (score>1000 ){
            return 1;
        }
        else if (score > 500){
            return 2;
        }
        else if (score >100){
            return 3;
        }
        else {
            return 4;
        }
    }



}
