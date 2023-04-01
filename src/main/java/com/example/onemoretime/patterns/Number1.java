package com.example.onemoretime.patterns;

public class Number1 {
    public static void main(String[] args) {
                                        /*12345
                                        12345
                                        12345
                                        12345
                                        12345*/
        print(5);
    }

    static void print(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col=1;col<=n;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
