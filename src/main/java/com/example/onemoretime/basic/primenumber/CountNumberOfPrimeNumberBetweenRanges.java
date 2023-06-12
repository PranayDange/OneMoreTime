package com.example.onemoretime.basic.primenumber;

public class CountNumberOfPrimeNumberBetweenRanges {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        numberOfPrimeNumberBetweenRanges(a, b);
    }

    static int numberOfPrimeNumberBetweenRanges(int num1, int num2) {
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
                count++;
            }
        }
        System.out.println("total prime number in given range are:");
        System.out.println(count);
        return count;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
