package com.example.onemoretime.patterns;

public class KPattern30 {
    /* 1
    212
   32123
  4321234
 543212345*/
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }
            for (int col = row; col > 1; col--) {
                System.out.print(col);
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }


            System.out.println();
        }
    }
}
