package com.example.onemoretime.patterns;

public class Number2 {
    public static void main(String[] args) {
        /*55555
        44444
        33333
        22222
        11111*/
        print(5);
    }

    static void print(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = n; col >= 1; col--) {
                System.out.print(row);
            }

            System.out.println();
        }
    }
}
