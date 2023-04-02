package com.example.onemoretime.patterns;

public class KPattern17 {
              /* 1
              212
             32123
            4321234
             32123
              212
               1*/
    public static void main(String[] args) {
        print(4);
    }

    static void print(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int totlaCol = row > n ? 2 * n - row : row;

            for (int spaces = 0; spaces < n - totlaCol; spaces++) {
                System.out.print(" ");
            }
            for (int col = totlaCol; col > 1; col--) {
                System.out.print(col);
            }
            for (int col = 1; col <= totlaCol; col++) {
                System.out.print(col);
            }

//            for (int col = 1; col < 2 * n - row; col++) {
//                System.out.print(col);
//            }


            System.out.println();
        }
    }
}
