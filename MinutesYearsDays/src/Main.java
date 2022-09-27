public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("--------------");
        printYearsAndDays(1440);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = (minutes / (365 * 24 * 60));
            long remainingMinutes = minutes % (365 * 24 * 60);
            long days = remainingMinutes / (24 * 60);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }

    public static void printEqual(int a, int b, int c) {
        if (a <0 || b<0 || c<0) {
            System.out.println("Invalid Value");
        } else if (a == b && b==c && c==a) {
            System.out.println("All numbers are equal");
        } else if (a != b && b!=c && c!=a) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <=45) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temperature >= 25 && temperature <=35) {
                return true;
            } else {
                return false;
            }
        }
    }
}