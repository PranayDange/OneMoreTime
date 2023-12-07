package com.example.onemoretimejava.arrays;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
       // String ss = "thequickbrownfoxjumpsoverthelazydog";
        String ss = "pranay";
        checkIfPangram(ss);
    }

    static boolean checkIfPangram(String sentence) {
        boolean flag = false;
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
            } else {
                flag = true;
            }
            break;

        }
        System.out.println(flag);
        return flag;
    }
}
