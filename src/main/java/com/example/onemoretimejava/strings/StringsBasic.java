package com.example.onemoretimejava.strings;

public class StringsBasic {
    public static void main(String[] args) {
        //strings are immutable in java

        String a = "pranay";
        //System.out.println(a);
        a = "Dange";
        //System.out.println(a);
        String b = "pranay";


        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            //System.out.print(ch);
            series = series + ch;
        }

        StringBuilder build = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            build.append(ch);
        }
        System.out.println(build);

    }
}
