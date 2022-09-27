import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] testArray = getIntegers(5);
//        int[] myArray = new int[5];
//        System.out.println(Arrays.toString(myArray));

        printArray(testArray);
        sortIntegers(testArray);
        printArray(sortIntegers(testArray));
        printArray(testArray);

//
    }

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter " + number + " integer values: \r");
        int[] array = new int[number];

        for (int i=0; i< array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;

    }
    public static void printArray(int[] array) {
        for (int i=0; i< array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i=0; i< array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0; i< sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;

                }
            }
        }
        return sortedArray;
    }
}