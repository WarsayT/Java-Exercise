package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("------------");
        System.out.println(isEvenNumber(4));


//        int count = 1;
//        while (count != 6) {
//            System.out.println("count value is " + count);
//            count++;
//        }
//        System.out.println("------------");
//        for(int i=1; i != 6; i++) {
//            System.out.println("count value is " + i);
//        }
//        System.out.println("------------");
//        // Do while has advantage that it always execute at least once
//
//        count = 6;
//        do {
//            System.out.println("count value is " + count);
//            count++;
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6 );
        int number = 4;
        int finishNumber = 20;
        int sum = 0;
        int count = 0;
        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            sum +=number;
            count++;
            if (count ==5) {
                break;
            }
        }
        System.out.println("The total sum: " + sum);

    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);

    }
}