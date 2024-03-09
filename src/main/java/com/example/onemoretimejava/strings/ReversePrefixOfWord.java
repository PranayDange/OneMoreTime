package com.example.onemoretimejava.strings;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
       /* Input: word = "abcdefd", ch = "d"
        Output: "dcbaefd"
        Explanation: The first occurrence of "d" is at index 3.
        Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".*/
    }
    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);

        if (index != -1) {
            char[] charArray = word.toCharArray();

            // Single loop to swap characters from the beginning up to the index of ch
            for (int i = 0; i < index; i++) {
                char temp = charArray[i];
                charArray[i] = charArray[index];
                charArray[index] = temp;
                index--; // Decrement index to move towards the start of the segment
            }

            // Convert the char array back to a string
            return new String(charArray);
        }

        return word; // If ch is not found, return the original word
    }
   /* public static String reversePrefix(String word, char ch) {
        char[] charArray = word.toCharArray();
        String addd="";
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == (ch)) {

            }

        }

    }*/

    static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        String revered = new String(charArray);
        return revered;
    }
}
