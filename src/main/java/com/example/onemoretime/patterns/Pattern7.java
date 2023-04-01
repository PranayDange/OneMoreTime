package com.example.onemoretime.patterns;

public class Pattern7 {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n) {
        int k = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(" " + (k));
                k = k + 2;
            }
            System.out.println();
        }
    }
}
