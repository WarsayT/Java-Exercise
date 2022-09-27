public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(sumFirstAndLastDigit(2343));
        System.out.println(getEvenDigitSum(24754));
        System.out.println(hasSharedDigit(24, 34));
        System.out.println(hasSameLastDigit(534,243,176));
        System.out.println(getGreatestCommonDivisor(12, 30));
        printFactors(10);
        System.out.println(isPerfectNumber(28));
        numberToWords(234);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0){
            return -1;
        } else {
            int sum = 0;
            int lastDigit = (number % 10);
            int firstDigit = 0;
            while (number > 0) {
                firstDigit = (number % 10);
                number /= 10;
            }
            sum = lastDigit + firstDigit;
            return sum;
        }
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int evenSum = 0;
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                if (digit % 2 == 0) {
                    evenSum += digit;
                }
            }
            return evenSum;
        }
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            for (int i = num1; i > 0; i /= 10) {
                for (int j = num2; j > 0; j /= 10) {
                    if (i % 10 == j % 10) {
                        return true;
                    }
                }
            }

        }
        return false;
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((isValid(num1)) && (isValid(num2)) && (isValid(num3))) {
            int lastDigit1 = num1 % 10;
            int lastDigit2 = num2 % 10;
            int lastDigit3 = num3 % 10;
            return (lastDigit1 % 10 == lastDigit2 % 10) || (lastDigit1 % 10 == lastDigit3 % 10) ||
                    (lastDigit2 % 10 == lastDigit3 % 10);


//            for (int i = num1; i > 0; i /= 10) {
//                for (int j = num2; j > 0; j /= 10) {
//                    for (int k = num3; k>0; k/= 10)
//                    if ((i % 10 == j % 10) || (i % 10 == k % 10) || (j % 10 == k % 10)) {
//                        return true;
//                    }
//                }
//            }

        }
        return false;
    }

    public static boolean isValid(int number) {
        return (number >=10 && number <=1000);
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num1 < 10 || num2 <10) {
            return -1;
        }
        while (num1 != num2) {
            if(num1 > num2) {
                num1 = num1 - num2;
            }else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
//        int i= 0;
//        int factor = 0;
        for( int j=1; j <= number; j++)
            if (number%j == 0) {
                System.out.println(j);
            }
//        while (i > number) {
//            i++;
//            if (number % i == 0) {
//                factor = i;
//            }
//        }

    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sumOfPerfectDivisors = 0;
        for ( int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfPerfectDivisors +=i;
            }
        }
        return (number == sumOfPerfectDivisors);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reverseNumber = reverse(number);
        for (int i= 0; i < getDigitCount(number); i++) {
            switch (reverseNumber%10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverseNumber/=10;
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number%10);
            number/=10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int digitCount = 1;
        while (number > 9) {
            number/=10;
            digitCount++;
        }
        return digitCount;
    }



}