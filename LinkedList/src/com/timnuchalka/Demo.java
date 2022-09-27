package com.timnuchalka;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");

        printList(placesToVisit);
        visit(placesToVisit);
//        placesToVisit.add(1, "Alice Springs");
//        printList(placesToVisit);
//        placesToVisit.remove(4);
//        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        for (int i=0; i< linkedList.size(); i++) {
            System.out.println("Now Visiting " + linkedList.get(i));
        }
        System.out.println("===========================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison>0) {
                //new city should appear before this one
                //brisbane --> adelaine
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else {
                //move on to the next record

            }

        }
        stringListIterator.add(newCity);
        return true;

    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String > listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Vacation is over");
                    quit=true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward =true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    }else {
                        System.out.println("Reached the End of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward =true;
                    }
                    break;
                default:
                    System.out.println("Enter available choice from the menu");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available action:\nPress ");
        System.out.println("0 - To quit\n" + "1 - go to next city\n" + "2 - go to previous city ");
    }
}
