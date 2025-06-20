package com.example.leetcode150.twopointers;

public class IsSubsequence {
    public static void main(String[] args) {
        //Input: s = "abc", t = "ahbgdc"
        //Output: true
        // Input: s = "axc", t = "ahbgdc"
        //Output: false
        String s = "abc";
        String t = "ahbgdc";
        boolean subsequence = isSubsequence(s, t);
        System.out.println(subsequence);

    }

    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == s.length();
    }
}
