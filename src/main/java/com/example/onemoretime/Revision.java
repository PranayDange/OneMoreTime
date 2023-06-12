package com.example.onemoretime;

public class Revision {
    public static void main(String[] args) {
//121
        int a = 153;
        palindrome(a);

    }

    static void palindrome(int num) {
        int original = num;
        int sum = 0;
        while (num != 0) {
            int n = num % 10;
            // sum = sum * 10 + n;
            sum += Math.pow(n, 3);
            num = num / 10;
        }
        if (original == sum) {
            System.out.println("is armstrong");
        } else {
            System.out.println("is not palaindrome");
        }
    }


}
