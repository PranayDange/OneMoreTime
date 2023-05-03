package com.example.onemoretime.arraysk;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        // Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
        // Output: true
        String arr = "thequickbrownfoxjumpsoverthelazydog";
        checkIfPangram(arr);

    }

    static boolean checkIfPangram(String sentence) {
        boolean flag = false;
        for (char i = 'a'; i < 'z'; i++) {
            boolean pangram = sentence(i, sentence);
            if (!pangram) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        System.out.println(flag);
        return false;

    }

    static boolean sentence(char ch, String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
}
