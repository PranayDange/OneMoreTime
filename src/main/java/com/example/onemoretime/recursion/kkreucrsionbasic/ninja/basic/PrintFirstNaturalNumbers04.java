package com.example.onemoretime.recursion.kkreucrsionbasic.ninja.basic;

public class PrintFirstNaturalNumbers04 {
    public static void main(String[] args) {
        printNNaturalNumbers(5);

        System.out.println();
        printNNaturalNumbersReverse(5);

        System.out.println();

        print(6);
    }

    public static void printNNaturalNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNNaturalNumbers(n - 1);
        System.out.println(n);

    }

    public static void printNNaturalNumbersReverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNNaturalNumbers(n - 1);

    }

    public static void print(int n) {
        //Write your code here
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        print(n - 1);
        System.out.print(n + " ");

    }
}
