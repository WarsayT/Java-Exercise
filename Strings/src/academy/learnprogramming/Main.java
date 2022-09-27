package academy.learnprogramming;


public class Main {
    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019.";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        System.out.println("---------");

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        System.out.println("------------");

        double lastDouble = 120.47d;
        lastString = lastString + lastDouble;
        System.out.println(lastString);



    }
}