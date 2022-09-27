public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(getLargestPrime(16));
        System.out.println(getLargestPrime2(16));
        printSquareStar(8);
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }

    public static int getLargestPrime2(int number) {
        if (number < 2) {
            return -1;
        }
        int largestPrime = 0;
        for( int j=1; j <= number; j++) {
            if (number%j == 0) {
                if (isPrime(j)) {
                    largestPrime = j;
                }
            }
        }
        return largestPrime;
    }

    public static boolean isPrime(int n) {
        if (n==1) {
            return false;
        }

        for (int i=2; i<= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Input");
        } else {
            for (int i=1; i<=number; i++){
               for (int j=1; j<=number; j++) {
                   if (i==1 || i==number) {
                       System.out.print("*");
                   } else if (j==1 || j==number) {
                       System.out.print("*");
                   } else if (i==j) {
                       System.out.print("*");
                   } else if (j == ( (number - i) + 1)) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }

               }
                System.out.println("");
            }
        }
    }
}