package com.example.onemoretimejava.recursion;

public class RecursiojnPractice {
    public static void main(String[] args) {
        System.out.println(sumOfADigitsUsingRecursion(1234));
        ;

    }

    private static int sumOfADigitsUsingRecursion(int n) {
        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * sumOfADigitsUsingRecursion(n / 10);

    }
}
