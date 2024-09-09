package com.example.onemoretimejava.strings;

import java.util.HashMap;
import java.util.Map;

public class SortingTheSentence {
    public static void main(String[] args) {
        String indices = "is2 sentence4 This1 a3";
        sortSentence(indices);
    }

    public static String sortSentence(String s) {
        String[] words = s.split("\\s");

        Map<Integer, String> map = new HashMap<>();

        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            // int index = Integer.parseInt(word.substring(words.length() - 1));
           // int index = Integer.parseInt(word.substring(word.length() - 1));// Get the last character and convert to integer
            int index = word.charAt(word.length() - 1) - '0'; // Get the last character as an integer


            String thatWord = word.substring(0, word.length() - 1); // Get the word without the last character
            map.put(index, thatWord);
            System.out.println("Key: " + index + ", Value: " + thatWord);

        }
        /*String reconstructed = "";
        for (int i = 0; i < map.size(); i++) {
            reconstructed = reconstructed + map.get(i) + " ";
        }*/
        //if we use string to manipulate in this case adding
     /*   You're right, and I apologize for the oversight. The issue lies in the way we are concatenating strings inside the loop.
        Each time we concatenate using the + operator, a new string object is created.
    Instead, we should use a StringBuilder to ensure efficient string manipulation*/

        // Reconstruct the original sentence using StringBuilder
        StringBuilder reconstructedSentence = new StringBuilder();
        for (int k = 1; k <= words.length; k++) {
            System.out.println(map.size());
            reconstructedSentence.append(map.get(k)).append(" ");
            System.out.println(map.get(k));

        }
        System.out.println(reconstructedSentence.toString().trim());
        return reconstructedSentence.toString().trim();
    }


    public static String sortSentence2(String s) {
        // Split the input sentence into an array of words using space as a delimiter
        String[] arr1 = s.split("\\s");
        // Create a new array to store the words in their correct order
        String[] arr = new String[arr1.length];

        // Loop through each word in the original array
        for (int i = 0; i < arr1.length; i++) {
            // Extract the index from the last character of the word.
            // Example for the first word:
            // arr1[0] = "is2"
            // arr1[0].charAt(arr1[0].length() - 1) returns '2'
            // Subtracting '0' from '2' gives 2
            int j = arr1[i].charAt(arr1[i].length() - 1) - '0';

            // Place the word (excluding the last character, which is the index) into the correct position in the new array.
            // Example for the first word:
            // arr1[0] = "is2"
            // arr1[0].substring(0, arr1[0].length() - 1) returns "is"
            // j = 2, so place "is" in arr[j - 1] which is arr[1]
            arr[j - 1] = arr1[i].substring(0, arr1[i].length() - 1);

            // Repeat for each word in the array
            // For arr1[1] = "the1":
            // arr1[1].charAt(arr1[1].length() - 1) returns '1'
            // Subtracting '0' from '1' gives 1
            // arr1[1].substring(0, arr1[1].length() - 1) returns "the"
            // j = 1, so place "the" in arr[j - 1] which is arr[0]
            // For arr1[2] = "dog3":
            // arr1[2].charAt(arr1[2].length() - 1) returns '3'
            // Subtracting '0' from '3' gives 3
            // arr1[2].substring(0, arr1[2].length() - 1) returns "dog"
            // j = 3, so place "dog" in arr[j - 1] which is arr[2]
        }

        // Create a StringBuilder to efficiently build the final sentence
        StringBuilder s1 = new StringBuilder();

        // Loop through the ordered array and append each word followed by a space
        for (int i = 0; i < arr.length; i++) {
            s1.append(arr[i] + " ");
        }

        // Convert the StringBuilder to a String and remove any trailing spaces
        return s1.toString().trim();
    }


}
