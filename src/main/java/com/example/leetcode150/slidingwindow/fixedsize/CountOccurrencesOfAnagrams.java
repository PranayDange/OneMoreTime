package com.example.leetcode150.slidingwindow.fixedsize;

import java.util.HashMap;

public class CountOccurrencesOfAnagrams {
    public static void main(String[] args) {


        String txt = "aabaabaa";
        String pat = "aaba";
        int search = search(pat, txt);
        System.out.println(search);


    }

    static int search(String pat, String txt) {
        int patLen = pat.length();
        int txtLen = txt.length();

        if (patLen > txtLen) {
            return 0;
        }


        HashMap<Character, Integer> patMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        //first window
        for (char ch : pat.toCharArray()) {
            patMap.put(ch, patMap.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        for (int i = 0; i < patLen; i++) {
            char ch = txt.charAt(i);
            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);
        }
        if (windowMap.equals(patMap)) {
            count++;
        }
        for (int i = patLen; i < txtLen; i++) {
            char newChar = txt.charAt(i);
            char oldChar = txt.charAt(i - patLen);

            // Add new character
            windowMap.put(newChar, windowMap.getOrDefault(newChar, 0) + 1);

            // Remove the character going out of the window
            if (windowMap.get(oldChar) == 1) {
                windowMap.remove(oldChar);
            } else {
                windowMap.put(oldChar, windowMap.get(oldChar) - 1);
            }

            if (windowMap.equals(patMap)) {
                count++;
            }


        }

        return count;

    }
}
