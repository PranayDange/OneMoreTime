package com.example.onemoretimejava.strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String ss = "abba";
        System.out.println(isPalindrome(ss));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        System.out.println(str);
        return true;

    }
}
