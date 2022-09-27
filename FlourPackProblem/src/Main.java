public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(canPack(1,0,4));
        printFactors(21);
    }

    public static boolean canPack(int bigCount,int smallCount, int goal) {
        for (int i = 0; i<=bigCount; i++) {
            for( int j=0; j<=smallCount; j++){
                if (((5*i) + j) == goal) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for( int j=1; j <= number; j++) {
            if (number%j == 0) {
                System.out.println(j);
            }
        }
    }
}