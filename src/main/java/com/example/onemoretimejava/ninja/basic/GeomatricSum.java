package com.example.onemoretimejava.ninja.basic;

public class GeomatricSum {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(findGeometricSum(n));
    }

    public static double findGeometricSum(int k) {
        if (k == 0) {
            return 1.0;
        }

        // Recursive case
        return (1.0 / Math.pow(2, k)) + findGeometricSum(k - 1);
    }
}
