package com.timbuchalka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        int count = 0;  //no need for count if we are not interested in limiting the
        // number if integers we want in this test
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            count++;
            System.out.print("Enter number#" +count+": ");
            boolean hasNExtInt = scanner.hasNextInt();

            if (hasNExtInt) {
                int number = scanner.nextInt();

                if (count < 5) {   //count is used to exit the loop after 5 numbers where entered
                    if (number > max) {
                        max = number;
                    }
                    if (number < min) {
                        min = number;
                    }
                }else {
                    break;
                }
            } else {
                System.out.println("Invalid Inout");
                count--; //use break if we are not limiting the number of integers we want to test
            }

            scanner.nextLine();
        }
        System.out.println("Min= " + min + ", and Max= " + max);
        scanner.close();
    }
}