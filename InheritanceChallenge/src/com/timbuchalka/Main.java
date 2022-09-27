package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("------------");

        Oulander outlander = new Oulander(36);
        outlander.stear(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);



    }
}