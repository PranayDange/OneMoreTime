package com.example.onemoretimejava.basic;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 7;

       // primeNumber(8);
        allPrimeNumbersTillANumber(n);
    }

    static void primeNumber(int n) {
        boolean flag = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");
        }

    }

    static void allPrimeNumbersTillANumber(int n) {

        for (int i = 2; i <= n; i++) {
            boolean flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(i + "number is prime");
            } else {
                System.out.println(i + "number is not prime");

            }

        }
    }
}
