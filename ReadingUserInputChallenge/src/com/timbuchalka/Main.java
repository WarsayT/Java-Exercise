package com.timbuchalka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("--------------");

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for( int i=1; i<=10; i++) {
            System.out.print("Enter number#" +i+ ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int number = scanner.nextInt();
                sum += number;
            } else {
                i -= 1;
                System.out.println("Invalid input");
            }
            scanner.nextLine();

        }
        System.out.println("");
        System.out.println("The total sum of the above 10 numbers is: " + sum);

//        int sum2 = 0;
//        int count = 1;
//        while( count <=10) {
//            System.out.print("Enter number#" +count+ ": ");
//            boolean hasNextInt = scanner.hasNextInt();
//            if (hasNextInt){
//                int number = scanner.nextInt();
//                count++;
//                sum2 += number;
//            } else {
//                System.out.println("Invalid input");
//            }
//
//            scanner.nextLine();
//        }
//        System.out.println("");
//        System.out.println("The total sum of the above 10 numbers is: " + sum2);

        scanner.close();
    }
}