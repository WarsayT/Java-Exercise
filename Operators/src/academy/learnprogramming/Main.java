package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);
        int prevousResult = result;
        System.out.println(prevousResult);
        result= result - 1;
        prevousResult = result;
        System.out.println(prevousResult);
        result = result * 10;
        System.out.println(result);
        result = result / 5;
        System.out.println(result);
        result = result % 3;
        System.out.println(result);

        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result /=3;
        System.out.println(result);

        result -=2;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien.");
            System.out.println("Im scared of Aliens");
        }

        int topScore = 80;
        if (topScore == 100) {
            System.out.println("You have got the highest score");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("greater and less");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("either or both are true");
        }

        boolean isCar = true;
        if (isCar) {
            System.out.println("true");
        }
        if (!isCar) {
            System.out.println("print this");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("this is true i guess");
        }

        int ageOfClient = 17;
        boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false;
        if (isEighteenOrOver) {
            System.out.println("is eighteen or over");
        }
        System.out.println("----------");
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myResult = (myFirstDouble + mySecondDouble) * 100.00d;
        System.out.println("my total value " + myResult);
        double myRemainder = myResult % 40.00d;
        System.out.println("The remainder is " + myRemainder);
        boolean isRemainderZero = (myRemainder == 0) ? true : false;

        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        }


    }
}