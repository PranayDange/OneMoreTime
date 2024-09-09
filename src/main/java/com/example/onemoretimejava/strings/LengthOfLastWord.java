package com.example.onemoretimejava.strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord7(String s) {
        int ans = 0;
        String trimmedString = s.trim();
        String[] splitString = trimmedString.split("\\s");
        if (splitString.length > 0) {
            String lastWord = splitString[splitString.length - 1];
            ans = lastWord.length();
        }
        return ans;
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

    public static String removeLastWord(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        int lastSpaceIndex = str.lastIndexOf(' ');

        if (lastSpaceIndex == -1) {
            // There is no space in the string, so return an empty string
            return "";
        }

        // Return the substring excluding the last word
        return str.substring(0, lastSpaceIndex);
    }
    public static String getLastWord2(String input) {
        if (input == null || input.isEmpty()) {
            return "";  // Return an empty string if input is null or empty
        }

        input = input.trim(); // Remove leading and trailing whitespace
        String[] words = input.split("\\s+"); // Split the string by whitespace

        if (words.length == 0) {
            return ""; // Return an empty string if there are no words
        }

        return words[words.length - 1]; // Return the last word
    }
}
