package com.example.onemoretime.basic.primenumber;

public class PrimeNumberWithinRange {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        numberWithinRange(a, b);
    }

    static void numberWithinRange(int a, int b) {

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            // for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
