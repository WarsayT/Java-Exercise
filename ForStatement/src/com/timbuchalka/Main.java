package com.timbuchalka;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("--------------");

//        System.out.println(calculateInterest(10000, 2));
//        System.out.println(calculateInterest(10000, 3));
//        System.out.println(calculateInterest(10000, 4));
//        System.out.println(calculateInterest(10000, 5));

//        for( int i=0; i<5; i++) {
//            System.out.println("Loop" + i + " hello!");
//        }

//        System.out.println(isPrime(81));

        int count = 0;
        for (int i = 10; i<50; i++) {
            if(isPrime(i)) {
                count +=1;
                System.out.println("Number " + i + " is a prime number.");
//                if (count == 3) {
//                    System.out.println("Exiting the loop");
//                    break;
//                }

            }
        }
//
//        System.out.println("Interest rate will be the following for the given challenge");
//        for( double i=2; i<9; i++) {
//            System.out.println(String.format("%.2f",calculateInterest(10000, i)));
//        }
//        System.out.println("Interest rate will be the following for the given challenge in reverse");
//        for( double i=8; i>1; i--) {
//            System.out.println(String.format("%.2f",calculateInterest(10000, i)));
//        }


    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if (n==1) {
            return false;
        }

        for (int i=2; i<= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}