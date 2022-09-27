public class TestTwo {
    public static void main(String[] args) {
        int[] intArray = {5, 1, 23, 21, 17, 2, 3, 9, 12};
        System.out.println(testForSum(intArray, 22));
    }

    public static boolean testForSum(int[] intArr, int testInt) {
        int count = 0;
        for (int i=0; i<intArr.length; i++) {
            for (int j = i+1; j<intArr.length; j++) {
                for (int k= j+1; k<intArr.length; k++) {
                    count++;
                    int sum = intArr[i] + intArr[j] + intArr[k];
                    System.out.println("Test " + count + ": " + "sum is " +sum+ ", and test integer is " + testInt);
                    if (sum == testInt) {
                        System.out.println("==============");
                        System.out.println("{ " + intArr[i] + ", " + intArr[j] + ", " + intArr[k] + " }");
                        return true;
                    }
                }
            }
        }
        return false;

    }


}
