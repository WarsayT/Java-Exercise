package com.timbuchalka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter a number: ");

        X x = new X(X.nextInt());

        x.x();

    }
//        String mainVar = "this is private to main()";
//
//        ScopeCheck scopeInstance = new ScopeCheck();
//        System.out.println("ScopeInstance varOne is: " + scopeInstance.getVarOne());
//        System.out.println(mainVar);
//
//        scopeInstance.timesTwo();
//        System.out.println("---------------");
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();
//
//    }
}