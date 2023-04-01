package com.example.onemoretime.patterns;

public class Pattern6 {

    /* 1  2  3  4  5
     6  7  8  9  10
     11 12 13 14 15
     16 17 18 19 20
     21 22 23 24 25*/
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n) {
        int k = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(" " + k);
                k++;
            }
            System.out.println();
        }


    }
}
