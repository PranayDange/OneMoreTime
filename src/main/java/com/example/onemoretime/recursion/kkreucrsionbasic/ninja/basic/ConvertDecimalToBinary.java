package com.example.onemoretime.recursion.kkreucrsionbasic.ninja.basic;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(5));
    }
    static String decimalToBinary(int n) {
        // Base case: when n becomes 0 or 1
        if (n == 0) {
            return "";
        }

        // Recursive case: divide n by 2 and append the remainder
        return decimalToBinary(n / 2) + (n % 2);
    }
}
