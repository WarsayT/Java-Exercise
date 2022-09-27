package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car porsche = new Car();
        Car holden = new Car();
        
        porsche.setModel("911");

        System.out.println("Model = " + porsche.getModel());

    }
}