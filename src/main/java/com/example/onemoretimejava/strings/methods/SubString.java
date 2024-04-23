package com.example.onemoretimejava.strings.methods;

public class SubString {
    public static void main(String[] args) {
        String str = "Hello, world!";
        String sub1 = str.substring(7); // Extracts from index 7 (inclusive) to the end
        System.out.println("Substring 1: " + sub1);


        String sub2 = str.substring(0, 5); // Extracts from index 0 (inclusive) to 5 (exclusive)
        System.out.println("Substring 2: " + sub2); // Output: Hello

        // Extracting a single character
        char ch = str.charAt(7); // Gets the character at index 7
        System.out.println("Character at index 7: " + ch);
    }
}
