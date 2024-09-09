package com.example.onemoretimejava.strings;

import java.util.Stack;


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


    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c); // Push the opening bracket onto the stack
            } else {
                // If the stack is empty or the top of the stack does not match the closing bracket
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets were properly closed
        return stack.isEmpty();
    }

}
