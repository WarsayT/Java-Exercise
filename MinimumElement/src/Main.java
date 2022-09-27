import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(findMin(readElements(readInteger())));

    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Elements: \r");
        int number = scanner.nextInt();
        return number;
    }

    private static int[] readElements(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] testArray = new int[number];
        System.out.println("Enter your elements here: \r");
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = scanner.nextInt();
        }
        scanner.close();
        return testArray;
    }

    private static int findMin(int[] array) {
        int[] sortedArray = new int[array.length]; //we will create a sorted array
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = array[i];
        }

        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;

                }
            }
        }
        return sortedArray[sortedArray.length - 1];
    }
}