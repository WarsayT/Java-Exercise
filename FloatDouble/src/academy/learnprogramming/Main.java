package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(myMinFloatValue);
        System.out.println(myMaxFloatValue);
        System.out.println("----------");
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(myMinDoubleValue);
        System.out.println(myMaxDoubleValue);
        System.out.println("----------");

        int myIntValue = 5/2;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;
        System.out.println(myIntValue);
        System.out.println(myDoubleValue);
        System.out.println(myFloatValue);
        System.out.println("----------");

        double myPounds = 200d;
        double myKilos =(myPounds * 0.45359237d);
        System.out.println(myKilos);

    }
}