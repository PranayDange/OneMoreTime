package com.example.onemoretimejava.strings;

public class StringReverse {
    public static void main(String[] args) {
        String ss = "pranay's";
        System.out.println(reverse(ss));
    }

    public static String reverse(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        String revered = new String(charArray);
        System.out.println(revered);
        return revered;
    }
}
