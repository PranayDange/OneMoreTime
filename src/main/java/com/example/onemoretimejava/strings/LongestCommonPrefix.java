package com.example.onemoretimejava.strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] ss = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(ss));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int n = strs.length;
        String ans = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return ans.toString();
                }
            }
            ans = ans + currentChar;
        }
        return ans;
    }


        public static String longestCommonPrefix2(String[] strs) {
            StringBuilder builder = new StringBuilder();
            String firstString = strs[0];

            // O(n*m) solution
            // n is the size of the first string, m is the size of strs array
            for (int i = 0; i < firstString.length(); i++) {
                for(int j = 1; j < strs.length; j++) {
                    if (i == strs[j].length())
                        return builder.toString();
                    if (firstString.charAt(i) != strs[j].charAt(i))
                        return builder.toString();
                }
                builder.append(firstString.charAt(i));
            }

            return builder.toString();
        }

}
