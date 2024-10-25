package com.example.onemoretime.recursion.kkreucrsionbasic.ninja.basic;

public class Practice {
    public static void main(String[] args) {
        // System.out.println(factorial(5));
        //  System.out.println(sum(5));
        // System.out.println(powerOf(2, 3));
        //printNumbers(5);
        // System.out.println(numOfDigits(123));
        //System.out.println(fibo(6));
        //  printNumbers(5);
        printNumbersReverse(5);
    }

    //1 factorial of a number
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int smallOutput = factorial(n - 1);
        int ans = n * smallOutput;
        return ans;
    }

    //2 sum of natural number
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int smallOutput = sum(n - 1);
        int ans = n + smallOutput;
        return ans;
    }

    //3 x to the power of n
    static int powerOf(int x, int n) {
        if (x == 0 && n == 0) {
            return 1;
        }
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int smallOutput = powerOf(x, n - 1);
        int ans = x * smallOutput;
        return ans;
    }

    //4 print first n naturan numbers
    static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.println(n + " ");
    }

    //5 count number of digits
    static int numOfDigits(int n) {
        if (n == 0) {
            return 1;
        }
        return 1 + numOfDigits(n / 10);
    }

    //6 fibonacci series using recursion
    static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int smallOutput = fibo(n - 1) + fibo(n - 2);
        return smallOutput;
    }

    //7 print numbers
    static void printNumbersIn(int n) {
        if (n == 0) {
            return;
        }
        printNumbersIn(n - 1);
        System.out.println(n + " ");
    }

    //8 print  numbers reverse
    static void printNumbersReverse(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n + " ");
        printNumbersReverse(n - 1);
    }
}
