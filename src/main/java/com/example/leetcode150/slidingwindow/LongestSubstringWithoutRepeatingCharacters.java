package com.example.leetcode150.slidingwindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String s = "abcabcbb";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);

    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = -1;
        while (j < s.length()) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.size() < j - i + 1) {
                j++;
            } else if (map.size() == j - i + 1) {
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                while (map.size() > j - i + 1) {
                    char c1 = s.charAt(i);
                    map.put(c1, map.get(c1) - 1);
                    if (map.size() > j - i + 1) {
                        map.remove(c1);
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
