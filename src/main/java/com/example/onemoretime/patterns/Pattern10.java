package com.example.onemoretime.patterns;

public class Pattern10 {
    public static void main(String[] args) {
       /* 1 1 2 1 3 1
          1 2 2 2 3 2
          1 3 2 3 3 3
          1 2 2 4 3 4
          1 5 2 5 3 5*/

        print(6);
    }

    static void print(int n) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print(col + " "  + row+" ");
            }
            System.out.println();
        }

    }
}
