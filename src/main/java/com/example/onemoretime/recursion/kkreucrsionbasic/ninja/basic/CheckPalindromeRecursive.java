package com.example.onemoretime.recursion.kkreucrsionbasic.ninja.basic;

public class CheckPalindromeRecursive {
    public static void main(String[] args) {
        String str = "abbba";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        // Recursive case: Compare the first and last characters
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // Call the function recursively for the substring without the first and last characters
            return isPalindrome(str.substring(1, str.length() - 1));
        }

        // If the first and last characters don't match, it's not a palindrome
        return false;
    }
}
