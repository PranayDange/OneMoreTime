package com.example.onemoretime.patterns;

public class KPattern5 {
          /*  *
            *  *
            *  *  *
            *  *  *  *
            *  *  *  *  *
            *  *  *  *
            *  *  *
            *  *
            **/


    public static void main(String[] args) {
        print(5);

    }

    static void print(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalCol; col++) {
                System.out.print(" * ");
            }
            /*for (int third = n; third >= n; third--) {
                System.out.print(" * ");
            }*/
            System.out.println();
        }
    }
}
