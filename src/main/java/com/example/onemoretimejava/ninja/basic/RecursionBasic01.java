package com.example.onemoretimejava.ninja.basic;


public class RecursionBasic01 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int smallOutput = factorial(n - 1);
        int output = n * smallOutput;
        return output;
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int smallOutput = sum(n - 1);
        int ans = n + smallOutput;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sum(5));

    }
}
