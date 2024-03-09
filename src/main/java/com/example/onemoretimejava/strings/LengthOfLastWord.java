package com.example.onemoretimejava.strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {

        String lastWord = getLastWord(s);
        int ans = 0;
        for (int i = 0; i < lastWord.length(); i++) {
            char[] charArray = lastWord.toCharArray();
            ans = charArray.length;

        }
        return ans;
    }

    public static String getLastWord(String str) {
        // Trim the string to remove leading and trailing whitespace
        str = str.trim();

        // Find the index of the last space character
        int lastIndex = str.lastIndexOf(' ');

        // Check if a space was found
        if (lastIndex != -1) {
            // Extract the substring starting from the index of the last space character + 1
            return str.substring(lastIndex + 1);
        } else {
            // If no space is found, return the original string
            return str;
        }
    }
}
