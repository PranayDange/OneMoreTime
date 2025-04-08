package com.example.onemoretimejava.ninja.stringrecursion;

public class ChangeCharacter {
    public static void main(String[] args) {
        System.out.println(changeChar("abxcxdx", 'x', 'y'));
    }

    public static String changeChar(String st, char a, char b) {
        if (st.length() == 0) {
            return st;
        }
        String smallOutput = changeChar(st.substring(1), a, b);
        if (st.charAt(0) == 'x') {
            return b + smallOutput;
        } else {
            return st.charAt(0) + smallOutput;
        }
    }


}
