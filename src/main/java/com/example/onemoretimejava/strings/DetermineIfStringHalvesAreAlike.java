package com.example.onemoretimejava.strings;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        int length = s.length() / 2;
        int a = 0;
        int b = 0;
        boolean ans = false;
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                a++;
            }
        }
        for (int i = length; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                b++;
            }

        }
        if (a == b) {
            ans = true;
        } else {
            ans = false;
        }
        return ans;
    }
}
