package com.example.onemoretime.ninja.basic;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println(sumOfSuriess(3));

    }

    static double sumOfSuriess(int n) {
        if (n == 1) {
            return 1.0;
        }
        return 1.0 / n + sumOfSuriess(n - 1);
    }
}
