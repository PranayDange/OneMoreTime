package com.example.onemoretimejava.strings;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        System.out.println(maxRepeating(sequence, word));
    }

    public static int maxRepeating(String sequence, String word) {
        int maxK = 0;
        String currentWord = word;
        while (sequence.contains(currentWord)) {
            maxK++;
            currentWord += word;
        }
        return maxK;
    }
}
