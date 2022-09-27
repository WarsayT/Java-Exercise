public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        toMilesPerHour((double) 1.25);
//        printConversion((double) 55.75);
//        printMegaBytesAndKiloBytes(2500);

//        System.out.println(shouldWakeUp(true, 7));
//        System.out.println(isLeapYear(1700));

//        areEqualByThreeDecimalPlaces(3.1756, 3.175);


    }

//    public static long toMilesPerHour (double kilometerPerHour) {
//        if (kilometerPerHour < 0) {
//            return -1;
//        } else {
//            return Math.round(kilometerPerHour / 1.609d);
//        }
//
//    }
//
//    public static void printConversion (double kilometerPerHour) {
//        if (kilometerPerHour >= 0 ) {
//            System.out.println(kilometerPerHour + " km/h = " + toMilesPerHour(kilometerPerHour) + " mi/h");
//        } else {
//            System.out.println("Invalid Value");
//        }
//
//    }
//
//    public static void printMegaBytesAndKiloBytes(int kiloByte) {
//        if (kiloByte < 0){
//            System.out.println("Invalid Value");
//        } else {
//            int megaByte = (Math.round(kiloByte/1024));
//            int remainingKiloByte = (kiloByte % 1024);
//            System.out.println(kiloByte + " KB = " + megaByte + " MB and " + remainingKiloByte + " KB");
//        }
//
//    }

//    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
//        return (isBarking == true && ((hourOfDay > 22 && hourOfDay <= 23) || (hourOfDay < 8 && hourOfDay >=0))) ? true : false;
//
//    }

//    public static boolean isLeapYear(int year) {
//        if (year < 1 || year > 9999) {
//            return false;
//        } else if (year % 4 == 0 && year % 100 != 0) {
//            return true;
//        } else return year % 100 == 0 && year % 400 == 0;
//    }

//    public static boolean areEqualByThreeDecimalPlaces(double numA, double numB) {
//        int a = (int) (numA * 1000);
//        int b = (int) (numB * 1000);
//        System.out.println(a);
//        System.out.println(b);
//        if (a == b) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }

//    public static boolean hasEqualSum(int a, int b, int c) {
//        if (a + b == c) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    public static boolean hasTeen (int a, int b, int c) {
//        if ((a >=13 && a <= 19) || (b >=13 && b <= 19) || (c >=13 && c <= 19)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static boolean isTeen(int d) {
//        if (d >=13 && d <= 19) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }
    public static boolean isTeen(int d) {
        return (d>=13 && d<=19);
    }



}
