package com.example.onemoretimejava.recursion.basic;

public class PlayingNumbers3 {
    public static void main(String[] args) {
        int n = 5;
        //  reverseNumbers(n);
        System.out.println();
        System.out.println();
        System.out.println();
        reverseNumbersUsingRecursion(n);
        System.out.println();
        System.out.println();
        System.out.println();
        reverseNumbersUsingRecursionCon(n);
        System.out.println();
        System.out.println();
        System.out.println();
        reverseNumbersUsingRecursionPrintStrait(n);
        System.out.println();
        System.out.println();
        System.out.println();
        reverseNumbersUsingRecursionPrintStraitAndReverseBoth(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(factorialOfANumberUsingRecursion(n));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(sumOfANumberUsingRecursion(n));


    }

    //1
    static void reverseNumbersUsingRecursion(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(" " + n);
        reverseNumbersUsingRecursion(n - 1);


    }

    static void reverseNumbersUsingRecursionCon(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(" " + n);
        // reverseNumbersUsingRecursionCon(n - 1);
        // reverseNumbersUsingRecursionCon(n--);//this will give infinite loop
        reverseNumbersUsingRecursionCon(--n);//this subtract first then pass the value of n

    }

    //2
    static void reverseNumbersUsingRecursionPrintStrait(int n) {
        if (n == 0) {
            return;
        }
        reverseNumbersUsingRecursionPrintStrait(n - 1);
        System.out.print(" " + n);
    }

    //3
    static void reverseNumbersUsingRecursionPrintStraitAndReverseBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(" " + n);
        reverseNumbersUsingRecursionPrintStraitAndReverseBoth(n - 1);
        System.out.print(" " + n);
    }

    //4
    static int factorialOfANumberUsingRecursion(int n) {
        if (n <= 1) {
            return 1;
        }
        // System.out.print(" " + n);
        /*int a = n;
        int b = factorialOfANumberUsingRecursion(n - 1);
       // System.out.println(b);


       // System.out.print(" " + a * b);
        return a*b;*/

        //or
        return n * factorialOfANumberUsingRecursion(n - 1);
    }

    //5
    static int sumOfANumberUsingRecursion(int n) {
        if (n <= 1) {
            return 1;
        }
        // System.out.print(" " + n);
        /*int a = n;
        int b = factorialOfANumberUsingRecursion(n - 1);
       // System.out.println(b);


       // System.out.print(" " + a * b);
        return a*b;*/

        //or
        return n + sumOfANumberUsingRecursion(n - 1);
    }


    static void reverseNumbers(int n) {
        for (int i = n; i >= 0; --i) {
            System.out.print("  " + i);
        }
    }
}
