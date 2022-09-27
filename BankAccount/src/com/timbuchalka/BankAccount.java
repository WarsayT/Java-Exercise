package com.timbuchalka;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("11111", 0.0, "default name", "default email addresss", "default phone number");
        System.out.println("called empty constructor ");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("called constructor with parameters");
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("00000", 10.0, customerName, email, phoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void deposit(double amount) {
        if(amount < 0) {
            System.out.println("Invalid amount to deposit");
        }else {
            this.balance += amount;
            System.out.println("New balance after depositing " + amount + " aed is: " + this.balance);
        }
    }
    public void withdraw(double amount) {
        if(amount>this.balance) {
            System.out.println("Invalid amount to withdraw");
        } else {
            this.balance -= amount;
            System.out.println("New balance after withdrawing " + amount + " aed is: " + this.balance);
        }
    }



}
