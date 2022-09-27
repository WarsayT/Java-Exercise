public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.out.println(isOdd(40));

        System.out.println(sumOdd(1,10));




//        int sum = 0;
//        int count = 0;
//
//        for (int i=1; i<=1000; i++) {
//            if (i%3 == 0 && i%5 == 0) {
//                System.out.println("The number " + i + " is divisible by both 3 and 5.");
//                sum +=i;
//                count++;
//                if (count == 5) {
//                    System.out.println("The total sum of the above numbers is: " + sum);
//                    break;
//                }
//            }
//        }
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else {
            return (number % 2) != 0;
        }
    }

    public static int sumOdd(int start, int end) {
        int sumOfOdds;
        if (((start < 0) || (end < 0)) || (end < start)) {
            return -1;
        } else {
            sumOfOdds = 0;
            int i;
            for (i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOfOdds += i;
                }

            }
            return sumOfOdds;
        }

    }
}