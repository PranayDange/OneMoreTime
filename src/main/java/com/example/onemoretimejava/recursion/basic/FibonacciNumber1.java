package com.example.onemoretimejava.recursion.basic;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber1 {
    static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibo(n));
        System.out.println(fibo2(n));
        // fiboWithRecursion(n);
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    static int fibo2(int n) {

        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result;
        if (n < 2) {
            result = n;
        } else {
            result = fibo(n - 1) + fibo(n - 2);
        }
        memo.put(n, result);
        return result;
    }

    static void fiboWithRecursion(int n) {
        long a = 0;
        long b = 1;
        if (n < 0) {
            System.out.println("num should be +ve");
        }
        if (n == 0) {
            System.out.println(a);
        } else if (n == 1) {
            System.out.println(b);
        } else {
            long c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
                // System.out.println(" " + c);

            }
            // System.out.println();
            System.out.println(" " + c);
        }
    }
}
