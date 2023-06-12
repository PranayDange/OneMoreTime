package com.example.onemoretime.basic;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 8;
        int a = 0;
        System.out.print(a + " ");
        int b = 1;
        System.out.print(b + " ");
        int c = 0;
        for (int i = 3; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");

        }
    }
}
