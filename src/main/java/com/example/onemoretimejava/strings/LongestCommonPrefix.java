package com.example.onemoretimejava.strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] ss = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(ss));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int n = strs.length;
        String ans = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return ans.toString();
                }
            }
            ans = ans + currentChar;
        }
        return ans;
    }
}
