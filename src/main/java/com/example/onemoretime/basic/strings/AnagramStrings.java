package com.example.onemoretime.basic.strings;

public class AnagramStrings {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        anagramString(str1, str2);
    }

    static void anagramString(String st1, String st2) {
        char[] charArray1 = st1.toCharArray();
        char[] charArray2 = st2.toCharArray();

        if (charArray1.length != charArray2.length) {
            System.out.println("Strings are not anagrams");
            return;
        }

        // Sort the character arrays
        // Arrays.sort(charArray1);
        //  Arrays.sort(charArray2);

        sortCharArray(charArray1);
        sortCharArray(charArray2);

        // Check if the sorted arrays are equal
        boolean isAnagram = true;
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                isAnagram = false;
                break;
            }
        }
        // boolean isAnagram = Arrays.equals(charArray1, charArray2);
        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    static void sortCharArray(char[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
