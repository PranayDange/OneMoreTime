package com.example.onemoretimejava.strings;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
     /*   Example 1:
        Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
        Output: true
        Explanation:
        word1 represents string "ab" + "c" -> "abc"
        word2 represents string "a" + "bc" -> "abc"
        The strings are the same, so return true.
                Example 2:

        Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
        Output: false*/
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        System.out.println( arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String s : word1) {
            s1.append(s);
        }
        for (String s : word2) {
            s2.append(s);
        }

       /* for (int i = 0; i < word1.length; i++) {
            s1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            s2.append(word2[i]);
        }*/


        System.out.println(s1);
        System.out.println(s2);
        return s1.toString().contentEquals(s2);
    }
}
