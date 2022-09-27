package com.timbuchalka;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;

    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        } else {
            Branch newBranch = new Branch(branchName);
            newBranch.newCustomer(customerName,initialTransaction);
            this.branches.add(newBranch);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if (findBranch(branchName) != null) {
            return findBranch(branchName).addCustomerTransaction(customerName,transaction);
        } else {
            findBranch(branchName).addCustomerTransaction(customerName, transaction);
            return true;
        }
    }

    private Branch findBranch(String  branchName) {
        for (Branch branch : this.branches) {
            String searchedBranch = branch.getName();
            if (searchedBranch.equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        ArrayList<Customer> customerList = branch.getCustomers();
        if (customerList.size() == 0) {
            return false;
        }
        System.out.println("Customer details for branch " + branch.getName());
        for (int i=0; i<customerList.size(); i++) {
            System.out.println("Customer: " + customerList.get(i).getName() + "[" + (i+1) + "]");
            if(!(printTransactions)) {
                continue;
            }
            System.out.println("Transactions");
            ArrayList<Double> transactions = customerList.get(i).getTransactions();
            for (int j=0; j<transactions.size(); j++) {
                System.out.println("[" + (j+1) + "]  Amount " + transactions.get(j));
            }
        }
        return true;
    }
}
