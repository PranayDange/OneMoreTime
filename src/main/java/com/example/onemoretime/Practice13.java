package com.example.onemoretime;

import java.util.Arrays;

public class Practice13 {
    public static void main(String[] args) {
       // String arr = "thequickbrownfoxjumpsoverthelazydog";
        String arr = "abcd";
        checkIfPangram(arr);

    }

    static boolean checkIfPangram(String sentence) {

        boolean flag = false;
        for (char i = 'a'; i <= 'z'; i++) {
            boolean charFlag = false;

            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == i) {
                    charFlag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            if (!charFlag) {
                flag = false;
                break;
            } else {
                flag = true;
            }

        }
        System.out.println(flag);
        return flag;
    }
}
