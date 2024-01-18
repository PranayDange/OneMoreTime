package com.example.onemoretimejava.search.linear;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "pranay";
        char ss = 'k';
        System.out.println(search(name, ss));
    }

    static boolean search(String str, char ch) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;

            }
        }
        return false;
    }
}
