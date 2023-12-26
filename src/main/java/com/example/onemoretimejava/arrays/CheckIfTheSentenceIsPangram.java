package com.example.onemoretimejava.arrays;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        // String ss = "thequickbrownfoxjumpsoverthelazydog";
        //  String ss = "pranay";
        String ss = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        checkIfPangram(ss);
    }

    static boolean checkIfPangram(String sentence) {
        boolean flag = true;

        for (char c = 'a'; c <= 'z'; c++) {
            boolean found = false;

            for (int i = 0; i < sentence.length(); i++) {
                if (c == sentence.charAt(i)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                flag = false;
            }
        }

        System.out.println(flag);
        return flag;
    }
// for string anmt i am getting true
}
