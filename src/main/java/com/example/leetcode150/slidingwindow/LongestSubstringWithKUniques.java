package com.example.leetcode150.slidingwindow;

import java.util.HashMap;

public class LongestSubstringWithKUniques {
    public static void main(String[] args) {
//Input: s = "aabacbebebe", k = 3
//Output: 7
//Explanation: "cbebebe" is the longest substring with 3 distinct characters.
        String a = "aabacbebebe";
        int k = 3;
        int i = longestkSubstr(a, k);
        System.out.println(i);

    }


    public static int longestkSubstr(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = -1;
        while (j < s.length()) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.size() < k) {
                j++;
            } else if (map.size() == k) {
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                while (map.size() > k) {
                    char leftChar = s.charAt(i);
                    map.put(leftChar, map.get(leftChar) - 1);
                    if (map.get(leftChar) == 0) {
                        map.remove(leftChar);
                    }
                    i++;
                }
                j++;
            }
        }
        return max;

    }
}
