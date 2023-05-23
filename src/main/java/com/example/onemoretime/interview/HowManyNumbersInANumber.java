package com.example.onemoretime.interview;

public class HowManyNumbersInANumber {

    public static void main(String[] args) {
        output(142454, 4);
    }

    static void output(int n, int d) {
        int count = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit == d) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
