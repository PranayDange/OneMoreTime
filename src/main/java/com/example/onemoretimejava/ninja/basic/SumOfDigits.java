package com.example.onemoretimejava.ninja.basic;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumOfDigits(n));
    }

    public static int sumOfDigits(int input) {
        // Write your code here
        if (input == 0) {
            return 0;
        }
        int sum = 0;
        int count = (input % 10) + sumOfDigits(input / 10);
        System.out.println("ppp" + count);
        sum = sum + count;
        return sum;
    }
}
