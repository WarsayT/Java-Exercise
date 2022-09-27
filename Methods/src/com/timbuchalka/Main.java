package com.timbuchalka;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("-------------");

        int position = calculateHighScorePosition(1000);
        displayHighScorePosition("Warsay", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Abiel", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Haben", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Daniel", position);

//        int highScore= calculateScore(true, 800, 5, 100);
//        System.out.println("Your final high score was " + highScore);
//
//        int secondScore= calculateScore(true, 10000, 8, 200);
//        System.out.println("the second score is " + secondScore);

    }

//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore +=2000;
//            return finalScore;
//        } else {
//            return -1;
//        }
//
//    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println( "Mr. " + name + " managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int score) {

//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;

    }
    


}