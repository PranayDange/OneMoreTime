package com.example.onemoretime.patterns;

public class AllStars {
    public static void main(String[] args) {
        allStarPattern(4);

    }

   /* public static void main(Integer[] args) {
        allStarPattern(4);

    }*/

    /*  solve for
     *****
     *****
     *****
     *****   */

    static void allStarPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
