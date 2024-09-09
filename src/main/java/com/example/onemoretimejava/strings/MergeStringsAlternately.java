package com.example.onemoretimejava.strings;

public class  MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately2(word1, word2));
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
    public static String mergeAlternately2(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int maxLength = Math.max(word1.length(), word2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                ans.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                ans.append(word2.charAt(i));
            }
        }

        return ans.toString();
    }

    public String mergeAlternately3(String word1, String word2) {
        String ans = "";
        int maxLength = Math.max(word1.length(), word2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                ans += word1.charAt(i);
            }
            if (i < word2.length()) {
                ans += word2.charAt(i);
            }
        }

        return ans;
    }

}
