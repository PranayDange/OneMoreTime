package com.example.onemoretime.recursion.kkreucrsionbasic.ninja.basic;

public class NumberOfDigits02 {
    public static void main(String[] args) {
        // Input: 'n' = 123 Output: 3
        System.out.println(countDigits(123));
    }

    public static int countDigits(int n) {
        return (int) (Math.log10(n) + 1);

    }

    public static int countDigits2(int n) {
        // Base case: when n becomes 0, stop recursion
        if (n == 0) {
            return 0;
        }
        // Recursive case: reduce n by a factor of 10, and add 1 for the current digit
        return 1 + countDigits(n / 10);
    }

}
