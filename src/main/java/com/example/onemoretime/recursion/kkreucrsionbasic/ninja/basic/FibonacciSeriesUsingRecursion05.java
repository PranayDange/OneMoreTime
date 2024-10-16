package com.example.onemoretime.recursion.kkreucrsionbasic.ninja.basic;

public class FibonacciSeriesUsingRecursion05 {
    public static void main(String[] args) {
        System.out.println(fibo(6));

    }

    public static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int store = fibo(n - 1) + fibo(n - 2);
        return store;
    }
}
