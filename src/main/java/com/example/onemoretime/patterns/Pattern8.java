package com.example.onemoretime.patterns;

public class Pattern8 {
    public static void main(String[] args) {
       /* 2  4  6  8  10
        12 14 16 18 20
        22 24 26 28 30
        32 34 36 38 40
        42 44 46 48 50*/
        print(5);
    }

    static void print(int n) {
        int k = 2;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(" " + k);
                k = k + 2;
            }
            System.out.println();
        }

    }
}
