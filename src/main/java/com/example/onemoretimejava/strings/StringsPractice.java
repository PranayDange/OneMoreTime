package com.example.onemoretimejava.strings;

import com.example.onemoretime.strings.methods.CharAt;

public class StringsPractice {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        restoreString(s, indices);
    }

    public static String restoreString(String s, int[] indices) {
        char[] sc = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sc[indices[i]] = s.charAt(i);
        }
        System.out.println(String.valueOf(sc));
        return String.valueOf(sc);
    }
}
