package com.example.onemoretimejava.ninja.stringrecursion;

import java.util.Objects;

public class RemoveDuplicatesRecursively {
    public static void main(String[] args) {
        String name = "aabccba";
        System.out.println(removeConsecutiveDuplicates(name));

    }

    public static String removeConsecutiveDuplicates(String s) {
        if (s.length() <= 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return removeConsecutiveDuplicates(s.substring(1));
        } else {
            return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
        }

    }

}
