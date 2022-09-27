public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(707));

    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int orginalNumber= number;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return (reverse == orginalNumber);
    }
}