package com.timbuckhalka;

import java.util.*;

public class Theatre {
    private String theatreName;
    private List<Seat> seats = new ArrayList<>();
    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if (seat1.getPrice() < seat2.getPrice()) {
                return -1;
            } else if (seat1.getPrice() > seat2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public Theatre(String theatreName, int nRow, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (nRow - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;
                if (row < 'D' && ( seatNum >= 4 && seatNum <= 9)) {
                    price = 14.00;
                } else if ((row > 'F') || ( seatNum < 4 || seatNum > 9)) {
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }

    }

    public boolean reserveSeat(String seatNum) {
//        int low = 0;
//        int high = seats.size();
//        while (low <= high) {
//            System.out.print(".");
//            int mid = (low + high) / 2;
//            Seat midVal = seats.get(mid);
//            int cmp = midVal.getSeatNumber().compareTo(seatNum);
//            if (cmp < 0) {
//                low = mid + 1;
//            } else if (cmp > 0) {
//                high = mid - 1;
//            } else {
//                return seats.get(mid).reserve();
//            }
//        }
//        System.out.println("There is no seat" + seatNum);
//        return false;
//    }
        Seat requestedSeat = new Seat(seatNum, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNum);
            return false;
        }
    }

//        for (Seat seat: seats) {
//            System.out.print(".");
//            if (seat.getSeatNumber().equals(seatNum)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if (requestedSeat == null) {
//            System.out.println("There is no seat " + seatNum);
//            return false;
//        }
//
//        return requestedSeat.reserve();
//    }

    public Collection<Seat> getSeats() {
        return seats;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private double price;
        private boolean reserved= false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved.");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("The reservation of the seat " + seatNumber + " cancelled.");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }

    }
}
