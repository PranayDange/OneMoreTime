package com.example.onemoretimejava.strings;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    public static void main(String[] args) {
        String s = "10001";
        System.out.println(checkOnesSegment(s));
    }

    public static boolean checkOnesSegment(String s) {
        int countSegments = 0;

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                // If the current character is '1', check if the next character is '0' or if it's the last character
                if (i == s.length() - 1 || s.charAt(i + 1) == '0') {
                    countSegments++; // Increment segment count
                }
            }
        }

        // If there's at most one segment of ones, return true
        return countSegments <= 1;
    }
}
