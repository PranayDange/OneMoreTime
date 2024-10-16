package com.example.onemoretime.recursion.kkreucrsionbasic.ninja.stringrecursion;

public class RemoveX {
    public static void main(String[] args) {
        String ss = "xaxbcx";
        System.out.println(removeX(ss));


    }

    public static String removeX(String input) {
        if (input.length() == 0) {
            return input;
        }
        if (input.charAt(0) == 'x') {
            return removeX(input.substring(1));

        }
        return input.charAt(0) + removeX(input.substring(1));
    }
}
