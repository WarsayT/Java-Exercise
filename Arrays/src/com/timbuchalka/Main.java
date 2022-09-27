package com.timbuchalka;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i=0; i< myIntegers.length; i++) {
            System.out.println("Element " + i + " , value is " + myIntegers[i]);
        }
        System.out.println("The average of " + myIntegers.length+ " integers from an array is " + getArrayAverage(myIntegers));


    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " +number+ " integer values: \r");
        int[] values = new int[number];
        for (int i=0; i< values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getArrayAverage(int[] array) {
        double arraySum=0;
        for (int i=0; i< array.length; i++) {
            arraySum += array[i];
        }
        return arraySum/array.length;
    }
}





////        int[] myIntArray = new int[10];
////        myIntArray[5] = 50;
////        myIntArray[6] = 45;
//
////        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//
//        int[] myIntArray = new int[10];
//        for (int i=0; i< myIntArray.length; i++) {
//            myIntArray[i] = i*10;
//        }
//
//        printArray(myIntArray);
//
//    }
//
//    public static void printArray(int[] array) {
//        for (int i=0; i< array.length; i++) {
//            System.out.println("Element " + i + " , value is " + array[i]);
//        }
//    }
//}