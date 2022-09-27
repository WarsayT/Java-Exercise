package com.timbuchalka;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double initialTransactions) {
        this.name = name;
        transactions.add(initialTransactions);
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
