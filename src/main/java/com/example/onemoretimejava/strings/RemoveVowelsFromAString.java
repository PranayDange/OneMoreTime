package com.example.onemoretimejava.strings;

public class RemoveVowelsFromAString {
    public static void main(String[] args) {
        String ss = "abcdefghijklmnopqrstuvwxyz";
        removeVowel(ss);
    }

    static String removeVowel(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                continue;
            } else {
                System.out.print(str.charAt(i));
            }
        }

        return str;
    }
}
