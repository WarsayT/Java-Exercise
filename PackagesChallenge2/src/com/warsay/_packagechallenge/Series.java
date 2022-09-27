package com.warsay._packagechallenge;

public class Series {

    public static int nSum(int n) {
        int sum =0;
        for (int i=0; i<=n; i++) {
            sum +=i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int factorial=1;
        if (n<0) {
            return -1;
        }else if (n == 0 || n==1) {
            return factorial;
        } else {
            for (int i=1; i<=n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n==1) {
            return 1;
        }
        long nMinus1= 1;
        long nMinus2 = 0;
        long fib = 0;
        for (int i=1; i<n; i++){
            fib = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 =fib;
        }
        return fib;
    }
}
