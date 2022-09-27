package com.timbuchalka;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;


    public ScopeCheck() {
        System.out.println("Scopecheck created, publicVar =" +publicVar+ ": and privateVar = "+ varOne);
    }


    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for (int i=0; i<10; i++) {
            System.out.println(i + " times two is " + i * varTwo);
        }
    }

    public class InnerClass {
        private int varThree = 3;

        public InnerClass() {
            System.out.println("Innerclass created, varOne is = " + varOne + " and varThree" + varThree);
        }
        public void timesTwo() {
            int varFour = 4;
            for (int i=0; i<10; i++) {
                System.out.println(i + " times three is " + i * varFour);
            }
        }

        public int getVarThree() {
            return varThree;
        }
    }
}
