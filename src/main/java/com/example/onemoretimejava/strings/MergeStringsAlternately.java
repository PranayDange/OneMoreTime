package com.example.onemoretimejava.strings;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
        //a p b q c r
    }

    public static String mergeAlternately(String word1, String word2) {
        char[] charArray = word1.toCharArray();
        char[] charArray1 = word2.toCharArray();
        String ans = "";
        int i = 0;
        int j = 0;
        while (i < charArray.length || j < charArray1.length) {
            if (i < charArray.length) {
                ans = ans + charArray[i];
                i++;
            }
            if (j < charArray1.length) {
                ans = ans + charArray1[j];
                j++;
            }
        }
        return ans;
    }
}
