package com.timbuchalka;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice of action: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryItem();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    findItem();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Choice not available");
                    break;
            }
        }

        System.out.println(Arrays.toString(groceryList.getGroceryList().toArray()));
    }

    public static void addItem() {
//        String exit = "Done";
        boolean quit = false;
        while (!quit) {
            System.out.print("Please enter the grocery item: ");
            String item = scanner.nextLine();
            if (item.equalsIgnoreCase("done")) {
                quit = true;
            } else {
                if (groceryList.findItem(item.toLowerCase())) {
                    System.out.println("Item already added");
                } else {
                    groceryList.addGroceryItem(item);
                }
            }
        }

    }

    public static void modifyItem() {
        System.out.println("Which item do you want to modify:");
        groceryList.printGroceryItem();
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        if (itemNo <=groceryList.getSize()) {
            System.out.print("Enter replacement item: ");
            String newItem = scanner.nextLine();
            groceryList.modifyGroceryList(itemNo , newItem);
        }
        System.out.println("Item number doesn't exist");

    }
    public static void removeItem() {
        System.out.println("Which item do you want to remove from your list:");
        groceryList.printGroceryItem();
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        if (itemNo <=groceryList.getSize()) {
            groceryList.removeGroceryItem(itemNo);
        }
        System.out.println("Item number doesn't exist");

    }

    public static void findItem() {
        System.out.print("Enter the item you want to find in your list: ");
        String searchItem = scanner.nextLine();
        if (searchItem == null) {
            System.out.println("Enter item to be searched");;
        } else if (groceryList.findItem(searchItem)) {
            System.out.println(searchItem + " does exist in your shopping list");
        } else {
            System.out.println(searchItem + " does not exist in your shopping list.");
        }
    }


    public static void printInstructions() {
        System.out.print("\nPress ");
        System.out.print("\n0 - To print choice option.");
        System.out.print("\n1 - To print the list of grocery.");
        System.out.print("\n2 - To add an item to the list.");
        System.out.print("\n3 - To modify an item from the list");
        System.out.print("\n4 - To remove an item from the list.");
        System.out.print("\n5 - To search for an item in the list.");
        System.out.println("\n6 - To quit the application.");
    }
}