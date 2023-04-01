package com.example.onemoretime.patterns;

public class Pattern5 {
    public static void main(String[] args) {
       /* 54321
        54321
        54321
        54321
        54321*/
        print(5);
    }

    static void print(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = n; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
