package com.timnuchalka;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 89.99);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(545.45);

        System.out.println("Customer " + customer.getName() + " have balance of " + customer.getBalance());

        System.out.println("AnotherCustomer " + anotherCustomer.getName()+ " have balance " + anotherCustomer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        for (int i=0; i<5; i++){
            intList.add(i+2);
        }
        for (int i=0; i<intList.size(); i++) {
            System.out.println("Element " +i+ ":" + intList.get(i));
        }
        intList.add(1, 456);
        System.out.println("after change");
        for (int i=0; i<intList.size(); i++) {
            System.out.println("Element " +i+ ":" + intList.get(i));
        }
    }
}