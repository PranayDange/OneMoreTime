package com.example.onemoretimejava.strings;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String input = "Let's take LeetCode contest";
        System.out.println(reverseWords(input));
    }

    public static String reverseWords(String s) {
        String[] split = s.split("\\s+");
        String reversed = "";
        for (int i = 0; i < split.length; i++) {
            String s1 = reverString(split[i]);
            reversed = reversed + s1 + " ";

        }
        return reversed.trim();
    }

    static String reverString(String reverse) {
        char[] charArray = reverse.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        String strReversed = new String(charArray);
        return strReversed;

    }

}
