package com.example.leetcode150.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
//Input: s = "ADOBECODEBANC", t = "ABC"
//Output: "BANC"
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String s1 = minWindow(s, t);
        System.out.println(s1);
    }

    public static String minWindow(String s, String t) {
        Map<Character, Integer> target = new HashMap<>();
        Map<Character, Integer> windowCounts = new HashMap<>();


        for (char ch : t.toCharArray()) {
            target.put(ch, target.getOrDefault(ch, 0) + 1);
        }
        int required = target.size(); // total unique characters in t (for ABC, required = 3)
        int formed = 0; // how many required characters are currently matched with correct count

        int i = 0;
        int j = 0;
        int minLen = Integer.MAX_VALUE;
        String newWin = "";

        while (j < s.length()) {
            char ch = s.charAt(j);
            windowCounts.put(ch, windowCounts.getOrDefault(ch, 0) + 1);

            if (target.containsKey(ch) && windowCounts.get(ch).equals(target.get(ch))) {
                formed++;
            }
            while (i <= j && formed == required) {
                if (j - i + 1 < minLen) {
                    minLen = j - i + 1;
                    newWin = s.substring(i, j + 1);
                }
                char leftChar = s.charAt(i);
                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);
                if (target.containsKey(leftChar) && windowCounts.get(leftChar) < target.get(leftChar)) {
                    formed--;
                }
                i++;
            }
            j++;
        }

        return newWin;
    }
}
