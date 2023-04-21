package com.example.onemoretime.patterns;

public class Practice {
    public static void main(String[] args) {
        print(5);

    }

    static void print(int n) {
        for (int row = 1; row <= n * 2; row++) {
            int totalCOL = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalCOL; col++) {
                // for (int colw = row ; colw > 1; colw--) {
                System.out.print(" * ");
                //}
                //System.out.print(" * ");
            }

            System.out.println();
        }
    }
}
