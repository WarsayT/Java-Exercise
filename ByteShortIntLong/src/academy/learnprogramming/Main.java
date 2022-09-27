package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value= " + myMinIntValue);
        System.out.println("Integer maximum value= " + myMaxIntValue);
        System.out.println(myMaxIntValue + 1);
        System.out.println(myMinIntValue - 1);
        System.out.println("--------");
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);
        System.out.println("--------");
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);
        System.out.println("--------");
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);
        long bigLongLiteralValue = 2147483647434L;
        System.out.println(bigLongLiteralValue);

        int bigShortTest = 32768;
        System.out.println(bigShortTest);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        System.out.println("--------sdsds-------");

        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 50;
        long myLongValue = 50000L + 10L * (myShortValue + myByteValue + myIntValue);

        System.out.println(myLongValue);

        short myShortTotal = (short) (10000 + 10 * (myByteValue + myIntValue));
        System.out.println(myShortTotal);



    }



}