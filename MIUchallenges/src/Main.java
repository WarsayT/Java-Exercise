public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        for (int i=0; i<=4; i++) {
//            System.out.print("Enter your" + (i +1) + "integer number: ");
//            int number = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println(reverse(number));
//        }
//        scanner.close();

//        int[] first= {1, 8, 3, 2};
//        int[] second={4, 2, 6, 1};
//        System.out.println(Arrays.toString(compareArray(first, second)));
//
//
//        int[] intArray = {3,4,5,6,2,4,5,6,6};
//        char arrayChars[] = new char[4];
//        arrayChars[0] = 'A';
//        arrayChars[1] = 'B';
//        arrayChars[2] = 'C';
//        arrayChars[3] = 'D';
//        int start = 2;
//        int len = 4;
//        System.out.println(Arrays.toString(a3(arrayChars, 0, arrayChars.length)));
//        int[] arrayInt = {4, 1, 2, 3};
//        System.out.println(centered(intArray));
//        System.out.println(arraySum(arrayInt));

        int[] arrayInt = {1, 2, 1};
        System.out.println(idxNumber(arrayInt));

    }

    public static int idxNumber(int[] a) {
        int i=0;
        int j= a.length -1;
        int idx= 1;
        int leftSum= a[i];
        int rightSum= a[j];
        for (int k=1; k< a.length - 2; k++) {
            if (leftSum < rightSum) {
                i++;
                leftSum += a[i];
                idx = i + 1;
            } else {
                j--;
                rightSum += a[j];
                idx = j - 1;
            }
        }
        if (leftSum==rightSum) {
            return idx;
        }
        else return -1;
    }

//    public static int[] compareArray(int[] first, int[] second) {
//        if (first==null || second==null) return null;
//        if (first.length==0 || second.length==0) return new int[0];
//        int min = (first.length < second.length) ? first.length : second.length;
//        int[] a, b;
//        if (min == first.length) {
//            a =first;
//            b=second;
//        } else {
//            a=second;
//            b=first;
//        }
//        int[] c = new int[min];
//        int k =0;
//        for (int i=0; i< a.length; i++) {
//            for (int j=0; j< b.length; j++) {
//                if (a[i] == b[j]) {
//                    c[k] = a[i];
//                    k++;
//                }
//            }
//        }
//        int[] retArray = new int[k];
//        for (int t = 0; t < retArray.length; t++)
//            retArray[t] = c[t];
//        return retArray;
//    }

//    public static int reverse(int number) {
//        if (number < 0) {
//            number *= -1;
//            int reversedNumber = 0;
//            int digit;
//            while (number > 0) {
//                digit = number % 10;
//                reversedNumber *=10;
//                reversedNumber += digit;
//                number /= 10;
//            }
//            return reversedNumber * -1;
//        }
//        int reversedNumber = 0;
//        int digit;
//        while (number > 0) {
//            digit = number % 10;
//            reversedNumber *=10;
//            reversedNumber += digit;
//            number /= 10;
//        }
//        return reversedNumber;
//
//    }


//    static char[] a3(char[] a, int start, int length) {
//        if (length < 0 || start < 0 || start + length - 1 >= a.length) {
//            return null;
//        }
//
//        char[] sub = new char[length];
//        for (int i = start, j = 0; j < length; i++, j++) {
//            sub[j] = a[i];
//        }
//        return sub;
//    }
//
//
//        public static char[] arrayChallenge(char[] a, int start, int len){
//        if ( a==null || len <0 || start<0 || start + len -1 >= a.length) {
//            return null;
//        }
//        char[] sub = new char[len];
//        for (int i=start, j=0; i < a.length; i++) {
//            sub[j] = a[i];
//        }
//        return sub;
//    }

//    public static int arraySum(int[] arrayInt) {
//        int X= 0;
//        int Y = 0;
//        for (int j : arrayInt) {
//            if (j % 2 == 0) {
//                Y += j;
//            } else {
//                X += j;
//            }
//        }
//        return X - Y;
//    }
//    public static int centered(int[] a) {
//        if (a != null && (a.length % 2) != 0) {
//            if (a.length == 1) {
//                System.out.println("one element");
//                return 1;
//            }
//            int midIndex = a.length / 2;
//            int middleItem = a[midIndex];
//            for (int i = 0; i < a.length; i++) {
//                if (i != midIndex && middleItem >= a[i]) {
//                    System.out.println("The middle element is grater or equal to one element of the array");
//                    return 0;
//                }
//            }
//            System.out.println("Its centered array");
//            System.out.println(middleItem);
//            return 1;
//        }
//        System.out.println("Its even array");
//        return 0;
//    }
}