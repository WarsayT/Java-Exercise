package com.timbuckhalka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
//        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        printList(seatCopy);
//        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("D12")) {
            System.out.println("Pay for the seat D12");
        } else {
            System.out.println("Seat D12 already reserved");
        }
        if (theatre.reserveSeat("B13")) {
            System.out.println("Pay for the seat B 13");
        } else {
            System.out.println("Seat B13 already reserved");
        }
        if (theatre.reserveSeat("D12")) {
            System.out.println("Pay for the seat D12");
        } else {
            System.out.println("Seat D12 already reserved");
        }
        List<Theatre.Seat> reversedSeat = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reversedSeat);
        printList(reversedSeat);

        List<Theatre.Seat> priceSeat = new ArrayList<>(theatre.getSeats());
        priceSeat.add(theatre.new Seat("B00", 13.00));
        priceSeat.add(theatre.new Seat("A00", 13.00));
        priceSeat.add(theatre.new Seat("C00", 13.00));
        Collections.sort(priceSeat, Theatre.PRICE_ORDER);
        printList(priceSeat);


//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seat copy after shuffled");
//        printList(seatCopy);
//        System.out.println("printing theatre.seats");
//        printList(theatre.seats);
//        System.out.println("Sorting lists");
//        sortList(seatCopy);
//        System.out.println("Printing sorted list after shuffled");
//        printList(seatCopy);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat: list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("====================================================");
    }

//    public static void sortList(List<? extends Theatre.Seat> list) {
//        for (int i=0; i< list.size(); i++) {
//            for (int j=i+1; j<list.size(); j++) {
//                if (list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }
}