package com.text._package;

import com.warsay._packagechallenge.Series;

public class Main {
    public static void main(String[] args) {
        System.out.println("n sum");
        for (int i=0; i<=10; i++) {
            System.out.println(Series.nSum(i));
        }
        System.out.println("factorial");
        for (int i=0; i<=10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("fibonacci");
        for (int i=0; i<=10; i++) {
            System.out.println(Series.fibonacci(i));
        }

        System.out.println("fib of n=14 is: " + Series.fibonacci(14));
    }
}