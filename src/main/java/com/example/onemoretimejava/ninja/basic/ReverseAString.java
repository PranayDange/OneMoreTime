package com.example.onemoretimejava.ninja.basic;

public class ReverseAString {
    public static void main(String[] args) {
        reverse("pranay");

    }
    static void reverse(String rev) {
        if (rev.length() == 0 ) {
            return;
        }
        System.out.print(rev.charAt(rev.length() - 1));
        reverse(rev.substring(0,rev.length()-1));


    }
}
