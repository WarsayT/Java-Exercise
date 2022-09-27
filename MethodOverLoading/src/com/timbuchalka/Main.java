package com.timbuchalka;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("------------");
//        double calculatedCentimeters = calcFeetAndInchesToCentimeters(12, calcFeetAndInchesToCentimeters(4));
//        System.out.println(calculatedCentimeters);

        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(7, 5);
        calcFeetAndInchesToCentimeters(-10,1);
        calcFeetAndInchesToCentimeters(23, 23);

        calcFeetAndInchesToCentimeters(157);
        calcFeetAndInchesToCentimeters(-10);


//        int newScore = calculateScore("Warsay", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();

    }

    public static double calcFeetAndInchesToCentimeters(double valueFeet, double valueInches) {
        if ((valueFeet < 0) || ((valueInches < 0) || (valueInches > 12))) {
            System.out.println("Invalid feet or inches input");
            return -1;
        }
        double centimeters = ((valueFeet * 12 * 2.54) + (valueInches * 2.54));
        System.out.println(valueFeet + " ft, " + valueInches + " inches= " +centimeters+ " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double valueInches) {
        if (valueInches < 0 ) {
            System.out.println("Invalid inches parameters");
            return -1;
        }
        double feet = (int) valueInches / 12;
        double remainingInches = (int) valueInches % 12;
        System.out.println(valueInches + " inches is equal to " + feet + " feet and " + remainingInches + " inches." );
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }


//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//    }
//    public static int calculateScore() {
//        System.out.println("NO player name, no score");
//        return 0;
//    }

}