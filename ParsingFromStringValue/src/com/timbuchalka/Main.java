package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("-----------");

        String numberAsString= "2018";
        System.out.println("NumberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("string changed to number = " + number);

        numberAsString +=1;
        number +=1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("Number = " + number);

        numberAsString = "2018.125";
        double numberDouble = Double.parseDouble(numberAsString);
        System.out.println(" string changed to double = " + numberDouble);

        numberAsString +=1;
        numberDouble +=1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("NumberDouble = " + numberDouble);


    }
}