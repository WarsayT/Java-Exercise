import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner= new Scanner(System.in);

        int sum=0;
        int count=0;
        while (true) {

//            System.out.print("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                count++;
                int number = scanner.nextInt();
                sum +=number;

            } else {
                break;
            }
        }
//        double average = Math.round((double) sum/count);
//        System.out.println("count ; " +count);
//        System.out.println("sum: " + sum);
        System.out.println("SUM = " +sum+ " AVG = "+ Math.round((double) sum/count));
        scanner.close();

    }
}