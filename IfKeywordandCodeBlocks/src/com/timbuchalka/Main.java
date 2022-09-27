package com.timbuchalka;


public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        //write some codes here

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        //int savedScore = finalScore;




//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//            System.out.println("This was executed");
//        } else if (score < 1000) {
//            System.out.println("Your score is less than 1000");
//        } else {
//            System.out.println("you got here");
//        }



//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your score here: ");
//        int grade=sc.nextInt();
//        String scoreA = "you scored A";
//        String scoreB = "you scored B";
//        String scoreC = "you scored c";
//        String scoreD = "You scored D";
//        String scoreF = "You have failed the class";
//        if (grade >= 90 && grade <= 100) {
//            System.out.println(scoreA);
//        } else if (grade >=80 && grade <90) {
//            System.out.println(scoreB);
//        } else if (grade >= 70 && grade <80) {
//            System.out.println(scoreC);
//        } else if ((grade >= 60) && grade < 70) {
//            System.out.println(scoreD);
//        } else  {
//            System.out.println(scoreF);
//        }

    }
}
