package com.example.onemoretimejava.maths.part2;

public class PrimeNUmber {
    public static void main(String[] args) {
        //a number which is divisible by 1 and number itself if prime number
        //2,3,5,7,13
        int n = 7;
        // isPrime(n);
        getPrimeAndNotPrime(n);

    }

    public static void isPrime(int n) {
        boolean prime = true;
        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

        }
        if (prime) {
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " is not prime number");

        }
    }

    public static void getPrimeAndNotPrime(int n) {
        // boolean prime = true;
      /*  if (n <= 1) {
            prime = false;
        } else {*/
        for (int i = 2; i <= n; i++) {
            boolean prime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i + " is prime number");
            } else {
                System.out.println(i + " is not prime number");

            }
        }

        // }

    }
}
