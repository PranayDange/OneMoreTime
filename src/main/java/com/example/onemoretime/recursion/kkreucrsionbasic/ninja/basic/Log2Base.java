package com.example.onemoretime.recursion.kkreucrsionbasic.ninja.basic;

public class Log2Base {
    public static void main(String[] args) {
       /* 10. Calculate Log Base 2 of a Number
        Problem: Write a recursive function to compute the integer part of the logarithm base 2 of a given number n.
                Example: log2(16) = 4 (since 2^4 = 16)*/

        System.out.println(log2(16));
    }

    static int log2(int n) {
        // Base case: when n is less than 2, return 0
        if (n < 2) {
            return 0;
        }
        // Recursive case: 1 + log2(n / 2)
        return 1 + log2(n / 2);
    }
}
