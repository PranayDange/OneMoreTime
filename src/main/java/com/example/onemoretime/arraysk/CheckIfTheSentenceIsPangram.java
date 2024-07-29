package com.example.onemoretime.arraysk;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        // Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
        // Output: true
        String arr = "thequickbrownfoxjumpsoverthelazydog";
        //String arr2 = "\"onrcsnlxckptsxffbyswujpamfltvmdoxovggepknmtacrjkkorjgvgtgaiaudspnpxkwikevmjeephhiyvnoymjwjfopovscbefecnoytjxfwasabwohqujwowmakpyuuqvgfab\"";
        System.out.println(checkIfPangram(arr));

    }

    static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        for (char i = 'a'; i < 'z'; i++) {
            boolean pangram = sentence(i, sentence);
            if (!pangram) {
                return false;
            }
        }
        return true;

    }

    static boolean sentence(char ch, String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }


    //this passess all test case
    public static boolean checkIfPangram2(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }

        // Create a HashSet to store unique letters
        Set<Character> letters = new HashSet<>();

        // Loop through each character in the sentence
        for (char c : sentence.toCharArray()) {
            // Add the character to the set if it is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }

        // Check if the set contains all 26 letters of the alphabet
        return letters.size() == 26;
    }
}
