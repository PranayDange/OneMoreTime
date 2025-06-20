package com.example.leetcode150.twopointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        //Input: s = "A man, a plan, a canal: Panama"
        //Input: s = "race a car"
        String s = "race a car";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        int left = 0;
        int right = cleaned.length() - 1;
        for (int i = 0; i < right; i++) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
