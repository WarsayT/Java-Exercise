import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int[] testArray = {1,2,3,4,5};
        reverse(testArray);
    }

    private static void reverse(int[] array) {
        System.out.println("Array= " +Arrays.toString(array));
        int[] reversedArray = Arrays.copyOf(array, array.length);

        int temp;
        for (int i=0; i< reversedArray.length; i++) {
           temp = array[i];
           reversedArray[i] = array[reversedArray.length - 1 - i];
           reversedArray[reversedArray.length -1 -i] = temp;
        }
        System.out.println("Reversed array= " + Arrays.toString(reversedArray));
    }
}