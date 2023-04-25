package com.example.onemoretime.basic;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 14;
        // System.out.println(primeNumber(n));
       // primeNumber(n);
        allPrimeNumbersTillANumber(n);
    }

    static void primeNumber(int n) {
        boolean flag = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {

                flag = true;
                //return false;
                break;
            }
            //  System.out.println(i);
        }
        if (!flag) {
            System.out.println(n + "is prime");
        } else {
            System.out.println(n + "not prime");
        }
    }

    static void allPrimeNumbersTillANumber(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isprime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(i + " is a prime number");
            } else {
                  System.out.println(i + " is not prime number");
            }
        }
    }
}
