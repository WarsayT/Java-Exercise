package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCae = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("207inche beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4, 6, "V2.44");

        PC thePC = new PC(theCae, theMonitor, theMotherBoard);

        thePC.powerUp();

    }
}