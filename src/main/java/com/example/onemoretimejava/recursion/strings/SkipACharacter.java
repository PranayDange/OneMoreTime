package com.example.onemoretimejava.recursion.strings;

public class SkipACharacter {
    public static void main(String[] args) {
       // strPrint("", "abcaadcad");
       // strPrint("abcaadcad");
          System.out.println(strPrint("abcaadcad"));
        // System.out.println(skpString("applestgapple"));
        //System.out.println(skpAppNotApple("appapplelestgapple"));
    }

    static void strPrint(String processed, String unProcessed) {
        //base condition
        //as unProcessed becomes empty..that means we have iterated through the string
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        if (ch == 'a') {
            strPrint(processed, unProcessed.substring(1));
        } else {
            strPrint(processed + ch, unProcessed.substring(1));

        }
    }

    static String strPrint(String unProcessed) {
        //base condition
        //as unProcessed becomes empty..that means we have iterated through the string
        if (unProcessed.isEmpty()) {
            return "";
        }
        char ch = unProcessed.charAt(0);
        if (ch == 'a') {
            return strPrint(unProcessed.substring(1));
        } else {
            return ch + strPrint(unProcessed.substring(1));

        }
    }

    static String skpString(String unProcessed) {
        //base condition
        //as unProcessed becomes empty..that means we have iterated through the string
        if (unProcessed.isEmpty()) {
            return "";
        }

        if (unProcessed.startsWith("apple")) {
            return skpString(unProcessed.substring(5));//for skipping 5 char
        } else {
            return unProcessed.charAt(0) + skpString(unProcessed.substring(1));

        }
    }

    static String skpAppNotApple(String unProcessed) {
        //base condition
        //as unProcessed becomes empty..that means we have iterated through the string
        if (unProcessed.isEmpty()) {
            return "";
        }

        if (unProcessed.startsWith("app") && !unProcessed.startsWith("apple")) {
            return skpAppNotApple(unProcessed.substring(3));//for skipping 3 char
        } else {
            return unProcessed.charAt(0) + skpAppNotApple(unProcessed.substring(1));

        }
    }
}
