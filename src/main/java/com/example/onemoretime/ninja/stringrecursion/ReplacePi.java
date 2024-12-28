package com.example.onemoretime.ninja.stringrecursion;

public class ReplacePi {
    public static void main(String[] args) {
        // String name = "piabc";
        String name = "apibc";
        System.out.println(replacePii(name));

    }

    public static String replacePii(String input) {
        if (input.length() <= 1) {
            return input;
        }
        if (input.charAt(0) == 'p' && input.charAt(1) == 'i') {
            return "3.14" + replacePii(input.substring(2));
        } else {
            return input.charAt(0) + replacePii(input.substring(1));
        }

    }
}
