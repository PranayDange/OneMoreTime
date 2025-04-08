package com.example.onemoretimejava.ninja.basic;

public class CalculateExponentialSum {
    public static void main(String[] args) {
       /* Problem: Write a recursive function to calculate the sum of 1^1 + 2^2 + 3^3 + ... + n^n.
        Example: expSum(3) = 1^1 + 2^2 + 3^3 = 1 + 4 + 27 = 32*/
        System.out.println(expoSum(3));
    }

    static int expoSum(int n) {
        if (n == 1) {
            return 1;
        }
        // int i = expoSum((int) Math.pow(n - 1, n - 1));
        //return i;

        return (int) Math.pow(n, n) + expoSum(n - 1);


    }
}
