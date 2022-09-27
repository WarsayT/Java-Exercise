package com.timbuchalka;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("-------------");
        printDayOfTheWeek(7);

        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("was 1");
                break;
            case 2:
                System.out.println("was 2");
                break;
            case 3: case 4: case 5:
                System.out.println(" was 3, 4, or 5");
                break;
            default:
                System.out.println("was not 1, 2, 3, 4, or 5");
                break;

        }

        char character= 'G';
        switch (character) {
            case 'A': case 'B':case 'C': case 'D': case 'E':
                System.out.println(character +" was found");
                break;
            default:
                System.out.println("not found");
        }

        String stringValue= "A";
        switch (stringValue) {
            case "A": case "B":case "C": case "D": case "E":
                System.out.println(stringValue +" was found");
                break;
            default:
                System.out.println("not found");
        }
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}