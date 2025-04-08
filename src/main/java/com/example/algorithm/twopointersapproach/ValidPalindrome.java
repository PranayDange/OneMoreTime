package com.example.algorithm.twopointersapproach;

public class ValidPalindrome {
    public static void main(String[] args) {
        String ss = "saasd";
        // boolean palindrome = isPalindrome(ss);
        //System.out.println(palindrome);
        System.out.println(isPalindrome(ss));

    }

    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++;
            right--;

        }
        return true;
    }

    public boolean isPalindrome2(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++; right--;
        }
        return true;
    }
}
