package com.example.onemoretimejava.strings;

public class StringReverse {
    public static void main(String[] args) {
        String ss = "pranay's";
        // System.out.println(reverse(ss));
        // reverseStringBuilder(ss);

        reverseUsingLoop(ss);
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

    public static void reverseStringBuilder(String s) {
        String original = s;
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();
        System.out.println(reversed); // Output: olleH

    }

    public static void reverseUsingLoop(String s) {
        char[] ss = s.toCharArray();
        String reversed = "";
        for (int i = ss.length - 1; i >= 0; i--) {
            reversed = reversed + ss[i];
        }
        System.out.println(reversed);

    }
}
