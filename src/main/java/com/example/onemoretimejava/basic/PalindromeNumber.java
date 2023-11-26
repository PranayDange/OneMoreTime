package com.example.onemoretimejava.basic;

public class PalindromeNumber {
    public static void main(String[] args) {
        isPalindrome(132);
    }

    static void isPalindrome(int num) {
        int temp = num;
        int sum = 0;
        while (num != 0) {
            int n = num % 10;
            sum = sum * 10 + n;
            num = num / 10;

        }
        if (temp == sum) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }
    }
}

