package com.example.onemoretime.ninja.basic;

public class NumberIsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(8));
    }

    static boolean isPrime(int n) {
        if (n == 2) {
            return false;
        }
        if (n % 2 == 0) {
            return isPrime(n - 1);
        }
        return true;
    }
}
