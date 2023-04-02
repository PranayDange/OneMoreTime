package com.example.onemoretime.patterns;

public class KPattern28 {
    /* *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     **/
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalNumbers = row > n ? 2 * n - row : row;
            int totalSpaces = n - totalNumbers;
            for (int spaces = 0; spaces < totalSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalNumbers; col++) {
                System.out.print("* ");


            }
            System.out.println();
        }

    }
}
