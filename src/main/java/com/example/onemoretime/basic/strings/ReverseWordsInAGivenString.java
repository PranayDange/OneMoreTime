package com.example.onemoretime.basic.strings;

public class ReverseWordsInAGivenString {
    public static void main(String[] args) {
        String ss = "pranay";
        // stringReverse(ss);
        //stringReverse1(ss);
        // stringReverse3(ss);
        String reversed = stringReverse4(ss);
        System.out.println(reversed);
    }

    static void stringReverse(String str) {
        StringBuilder string = new StringBuilder(str);
        string.reverse();
        System.out.println("Reveresed String  " + string);
    }

    static void stringReverse1(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        String reversed = new String(chars);
        System.out.println(reversed);
    }

    static void stringReverse3(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }

    //using recursion
    static String stringReverse4(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return stringReverse4(str.substring(1)) + str.charAt(0);
    }


}
