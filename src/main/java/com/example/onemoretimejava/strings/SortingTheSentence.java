package com.example.onemoretimejava.strings;

import java.util.HashMap;
import java.util.Map;

public class SortingTheSentence {
    public static void main(String[] args) {
        String indices = "is2 sentence4 This1 a3";
        sortSentence(indices);
    }

    public static String sortSentence(String s) {
        String[] words = s.split(" ");

        Map<Integer, String> map = new HashMap<>();

        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            // int index = Integer.parseInt(word.substring(words.length() - 1));
            int index = Integer.parseInt(word.substring(word.length() - 1));

            String thatWord = word.substring(0, word.length() - 1);
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
        for (int k = 1; k < words.length; k++) {
            System.out.println(map.size());
            reconstructedSentence.append(map.get(k)).append(" ");
            System.out.println(map.get(k));

        }
        System.out.println(reconstructedSentence.toString().trim());
        return reconstructedSentence.toString().trim();
    }
}
