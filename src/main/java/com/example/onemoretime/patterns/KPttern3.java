package com.example.onemoretime.patterns;

public class KPttern3 {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n) {
        for (int row = 1; row <= n; row++) {
           // for (int col = n; col >= row; col--) {
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
