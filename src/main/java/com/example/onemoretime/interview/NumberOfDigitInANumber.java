package com.example.onemoretime.interview;

public class NumberOfDigitInANumber {
    public static void main(String[] args) {
        reNumber(1215250);
    }

    static void reNumber(int n) {
        int count = 0;
        if (n == 0) {
            count = 1;
        }
        if (n < 0) {
            // System.out.println("enter +ve number");
            n = n * -1;
        }

        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);

    }
}
