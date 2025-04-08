package com.example.onemoretimejava.ninja.basic;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfEven(766));
        System.out.println(sumToN(7));

    }

    static int sumOfEven(int n) {
        if (n == 0) {
            return 0;
        }

        // Extract the last digit
        int lastDigit = n % 10;

        // Recursive call to process the rest of the digits
        int sumOfRest = sumOfEven(n / 10);

        // If the last digit is even, add it to the sum of the rest
        if (lastDigit % 2 == 0) {
            return lastDigit + sumOfRest;
        } else {
            return sumOfRest;
        }
    }

    //sum of even digits from 1..to n
    static int sumToN(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return n + sumToN(n - 1);
        } else {
            return sumToN(n - 1);
        }
    }
}
