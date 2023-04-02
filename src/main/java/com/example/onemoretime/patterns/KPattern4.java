package com.example.onemoretime.patterns;

public class KPattern4 {
    public static void main(String[] args) {
        print(5);
        /*1
        12
        123
        1234
        12345*/

    }

    static void print(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
