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
    public static int maxRepeatingg(String sequence, String word) {
        int maxK = 0;
        int wordLength = word.length();
        int sequenceLength = sequence.length();

        for (int i = 0; i <= sequenceLength - wordLength; i++) {
            int count = 0;
            for (int j = i; j + wordLength <= sequenceLength; j += wordLength) {
                if (sequence.substring(j, j + wordLength).equals(word)) {
                    count++;
                } else {
                    break;
                }
            }
            maxK = Math.max(maxK, count);
        }

        return maxK;
    }
}
