package com.example.onemoretime.patterns;

public class KPattern3 {
    public static void main(String[] args) {
       /* *  *  *  *  *
        *  *  *  *
        *  *  *
        *  *
        **/
        print(5);
    }

    static void print(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print(" * ");

            }
            System.out.println();

        }
    }
}
