package com.timbuchalka;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryItem() {
        System.out.println("You have " +groceryList.size()+ " items in your grocery list.");
        for (int i=0; i<groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(int position, String item) {
        if ((position -1) >= 0 && (position -1 ) <= groceryList.size()) {
            groceryList.set(position - 1, item);
            System.out.println("Grocery item " + position + " has been modified.");
        } else {
            System.out.println("Number item is not available");
        }

    }

    public void removeGroceryItem(int position) {
        if ((position -1) >= 0 && (position -1 ) <= groceryList.size()) {
            String removedItem = groceryList.get(position - 1);
            groceryList.remove((position -1));
            System.out.println("Grocery item " + removedItem +" has been removed from the grocery list");
        } else {
            System.out.println("Number item is not available.");
        }

    }

    public boolean findItem(String searchedItem) {
        return groceryList.contains(searchedItem);
    }

    public int getSize() {
        return groceryList.size();
    }

}
