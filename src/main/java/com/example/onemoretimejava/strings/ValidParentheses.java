package com.example.onemoretimejava.strings;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        int countParentheses = 0;
        int countBrackets = 0;
        int countBraces = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                countParentheses++;
            } else if (c == '[') {
                countBrackets++;
            } else if (c == '{') {
                countBraces++;
            } else if (c == ')') {
                countParentheses--;
            } else if (c == ']') {
                countBrackets--;
            } else if (c == '}') {
                countBraces--;
            }

            // If any counter becomes negative, the string is not valid
            if (countParentheses < 0 || countBrackets < 0 || countBraces < 0) {
                return false;
            }
        }

        // If all counters are zero at the end, the string is valid
        return countParentheses == 0 && countBrackets == 0 && countBraces == 0;
    }
}
