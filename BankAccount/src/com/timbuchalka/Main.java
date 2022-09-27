package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("-------------");

        BankAccount bankAccount1 = new BankAccount("22222", 0.0, "Warsay Teklebrhan", "myemail@email.com", "789-234543");

        bankAccount1.deposit(100.0);
        bankAccount1.withdraw(100.0);

        BankAccount warsAccount= new BankAccount("warsay", "warsa@gns.com", "2323-23-23");
        System.out.println(warsAccount.getBalance());

        VipCustomer vip1= new VipCustomer("Warsay", 50000.0);
        VipCustomer vip2 = new VipCustomer("warsay2", 40000, "warsay2EMAIL.COM");
        VipCustomer vip3 = new VipCustomer();

        System.out.println(vip1.getCreditLimit());
        System.out.println(vip2.getName());
        System.out.println(vip3.getName());
    }

}