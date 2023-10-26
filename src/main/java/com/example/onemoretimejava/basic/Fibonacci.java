package com.example.onemoretimejava.basic;

public class Fibonacci {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13
        // fiboSeries(10);
        fiboSum(5);
    }

    //series
    static void fiboSeries(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print("  " + c);

        }
    }


    static void fiboSum(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        int sum = a + b;
        for (int i = 1; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            sum = sum + c;
        }
        System.out.println(sum);
    }
}
