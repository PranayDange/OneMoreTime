package com.example.onemoretimejava.recursion.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
    public static void main(String[] args) {
        //subsets is for arrays
        //subsequence is for strings
        //p-processed
        //up--unprocessed
        //subseq("", "abc");
        subseqAscii("", "abc");
        //System.out.println(subseqArray("", "abc"));

    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(" " + p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
        //for opposite
        //subseq(p + ch, up.substring(1));
    }

    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
        subseq(p + (ch + 0), up.substring(1));

        //for opposite
        //subseq(p + ch, up.substring(1));
    }

    static ArrayList<String> subseqArray(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ll = subseqArray(p + ch, up.substring(1));
        ArrayList<String> lld = subseqArray(p, up.substring(1));
        //for opposite
        //subseq(p + ch, up.substring(1));
        ll.addAll(lld);
        return ll;
    }
}
