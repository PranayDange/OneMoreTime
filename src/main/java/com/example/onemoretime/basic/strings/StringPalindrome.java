package com.example.onemoretime.basic.strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String ss = "pranay";
        palindrome(ss);

    }

    static void palindrome(String str) {
        String store = str;
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        String reverse = new String(charArray);
        System.out.println(reverse);
        if (store.equals(reverse)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
