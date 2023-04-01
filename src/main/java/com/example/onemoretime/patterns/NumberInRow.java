package com.example.onemoretime.patterns;

public class NumberInRow {
    public static void main(String[] args) {
                                        /*11111
                                        22222
                                        33333
                                        44444
                                        55555*/
        pattern(5);

    }

    static void pattern(int n) {
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                System.out.print(row);
            }

            System.out.println();
        }

    }
}
