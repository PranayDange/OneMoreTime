package com.example.onemoretimejava.strings;

import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
        /*Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
        Output: "leetcode"
        Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.*/
        String ss = "codeleet";
        int[] indicies = {4, 5, 6, 7, 0, 2, 1, 3};
        restoreString(ss, indicies);
    }

    public static String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        System.out.println(Arrays.toString(result));
        return new String(result);

    }
}
