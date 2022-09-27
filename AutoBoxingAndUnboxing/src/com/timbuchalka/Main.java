package com.timbuchalka;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String>  strArrayList = new ArrayList<>();
        strArrayList.add("warsay");
        strArrayList.add("wars");
        System.out.println(strArrayList);

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(34));
        System.out.println(intClassArrayList.get(0).getMyValue());

        ArrayList<Integer> intArrayList = new ArrayList<>();
//        intArrayList.add(54);
//        System.out.println(intArrayList.get(0));
//        for (int i=0; i<=10; i++) {
//            intArrayList.add(i);
//        }
//
//        for (int i=0; i<=10; i++) {
//            System.out.println(i + " --> " + intArrayList.get(i));
//        }

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        for (double dbl = 0.0; dbl <=10.0; dbl +=0.5) {
            doubleArrayList.add(dbl);
        }

        for (int i=0; i<doubleArrayList.size(); i++) {
            System.out.println(i + " --> " + doubleArrayList.get(i));
        }


    }
}