package com.example.onemoretime.interview;

public class FibonacciNUmber {
    public static void main(String[] args) {
        numOutput(-1);
    }

    static void numOutput(int n) {
        int a = 0;
        System.out.print(a + " ");
        int b = 1;
        System.out.print(b);

        if (n < 0) {
            System.out.println("num should be +ve");
        }
        if (n == 0) {
            System.out.println(a);
        } else if (n == 1) {
            System.out.println(b);
        } else {
            int c = 0;
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(" " + c);
            }
            System.out.println();
            System.out.println("last digit" + " " + c);
        }
    }
    //HowManyNumbersInANumber
}
