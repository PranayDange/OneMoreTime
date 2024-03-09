package com.example.onemoretimejava.strings;

import com.example.onemoretime.strings.methods.CharAt;

import java.util.Arrays;

public class StringsPractice {
    public static void main(String[] args) {
        String s = "codeleet";
        String indices = "is2 sentence4 This1 a3";
        sortSentence(indices);
    }

    public static String sortSentence(String s) {
        String[] words = s.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
        Arrays.sort(words);
        System.out.println(String.join(" ", words));
        return String.join(" ", words);
    }
}
