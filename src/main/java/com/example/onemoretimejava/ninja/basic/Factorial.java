package com.example.onemoretimejava.ninja.basic;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialN(5));
    }

    static int factorialN(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorialN(n - 1);
    }
}
