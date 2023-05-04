package com.example.onemoretime.basic;

public class PalindromeNumber {
    public static void main(String[] args) {
        //palindrome number 121,131
        int number = 121;
      //  palindrome(number);
        palindrome2(number);

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

    static void palindrome2(int num) {
        int temp = num;
        String check = String.valueOf(num);
        String ans = new StringBuilder(check).reverse().toString();
        if (temp == Integer.parseInt(ans)) {
            System.out.println("is palindrome");
        } else {
            System.out.println("is not palindrome");
        }
    }
}
