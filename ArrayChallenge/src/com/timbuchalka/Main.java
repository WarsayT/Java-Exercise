package com.timbuchalka;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = getInteger(5);
        System.out.println("The integers we entered to our array are " + printArray(intArray));

        System.out.println("The sorted above array is " + Arrays.toString(sortArray(intArray)));
//        System.out.println(Arrays.toString(intArray));

    }

    private static int[] getInteger(int number) {
        System.out.println(" Enter " + number + " integer values: \r");
        int[] array = new int[5];

        for (int i=0; i< array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    private static String printArray(int[] array) {
        return Arrays.toString(array);
    }
//    private static String printArray(int[] array) {
//        String stringArray = "";
//        for (int j : array) {
//            if (j< array.length) {
//                stringArray += j + ", ";
//            } else {
//                stringArray += j + " ";
//            }
//        }
//        return stringArray;
//    }

    private static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
        for (int i=0; i< array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0; i< sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;

                }
            }
        }
        return sortedArray;
    }
}