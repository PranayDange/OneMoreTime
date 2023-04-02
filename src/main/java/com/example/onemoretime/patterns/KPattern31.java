package com.example.onemoretime.patterns;

public class KPattern31 {
    public static void main(String[] args) {
        print(4);
    }

    static void print(int n) {
        int originalN = n;
        n = 2 * n - 2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int ateveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(ateveryIndex);

            }
            System.out.println();
        }

    }


    //
            /*000000000
            011111110
            012222210
            012333210
            012343210
            012333210
            012222210
            011111110
            000000000*/


    static void print1(int n) {
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int ateveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(ateveryIndex);

            }
            System.out.println();
        }

    }
}
