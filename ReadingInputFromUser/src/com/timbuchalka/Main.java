package com.timbuchalka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("-----------");

        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            int age = 2022 -yearOfBirth;
            scanner.nextLine();
            if (age >= 0 && age <= 100) {
                System.out.print("Enter Your name: ");
                String name = scanner.nextLine();

                System.out.println("");

                System.out.println("Your name is " + name + " born in " + yearOfBirth + " ,and your age is " + age + ".");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("cant parse year of birth");
        }
        scanner.close();
    }
}