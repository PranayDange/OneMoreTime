package com.example.onemoretimejava.recursion.basic;

public class PalindromeRecursion {
    public static void main(String[] args) {
        System.out.println(palindromeRec(12344321));
    }

    static int rev2(int n) {
        //sometimes you might need some additional variables in the argument
        //it that case,make another function
        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static boolean palindromeRec(int n) {
        return n == rev2(n);
    }

    static void palindrome(int num) {
        int temp = num;
        int sum = 0;
        while (num != 0) {
            int n = num % 10;
            sum = sum * 10 + n;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("is palindrome");
        } else {
            System.out.println("is not palindrome");
        }

    }
}
