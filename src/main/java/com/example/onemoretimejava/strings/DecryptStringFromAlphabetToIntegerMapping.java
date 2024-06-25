package com.example.onemoretimejava.strings;

public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        String s = "10#11#12";
        //freqAlphabets(s);
        System.out.println( freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                // Handle the case where the current and next two characters form a "10#" to "26#"
                String numberStr = s.substring(i, i + 2);
                int num = Integer.parseInt(numberStr);
                char ch = (char) ('a' + num - 1);
                result.append(ch);
                i += 2; //// Skip the next two characters and the '#'
            } else {
                // Handle the single digit case
                int num = s.charAt(i) - '0';
                char ch = (char) ('a' + num - 1);
                result.append(ch);
            }
        }

        return result.toString();
    }
}
