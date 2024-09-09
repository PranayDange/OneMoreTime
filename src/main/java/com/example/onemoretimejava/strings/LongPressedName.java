package com.example.onemoretimejava.strings;

public class LongPressedName {
    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaaleex";
        System.out.println(isLongPressedName(name, typed));

    }

    public static boolean isLongPressedName(String name, String typed) {
        char[] nameCharArray = name.toCharArray();
        char[] typedCharArray = typed.toCharArray();

        // Initialize two pointers
        int i = 0;
        int j = 0;

        // Iterate through both arrays
        while (j < typedCharArray.length) {
            if (i < nameCharArray.length && nameCharArray[i] == typedCharArray[j]) {
                // Characters match, move both pointers forward
                i++;
                j++;
            } else if (j > 0 && typedCharArray[j] == typedCharArray[j - 1]) {
                // Current character in typed is a long press, move only the typed pointer forward
                j++;
            } else {
                // Mismatch found, return false
                return false;
            }
        }

        // Check if we have consumed all characters in the name array
        return i == nameCharArray.length;
    }
}
