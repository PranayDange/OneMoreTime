package com.example.onemoretimejava.strings;

public class NumberOfStringsThatAppearAsSubstringsInWord {
    public static void main(String[] args) {
        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";
        numOfStrings(patterns, word);
    }

    public static int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for (int i=0;i<patterns.length;i++){
            String ch = patterns[i];
            System.out.println(ch);
            if (word.contains(ch)){
                ans++;
            }
        }
        System.out.println(ans);
        return ans;
    }
}
