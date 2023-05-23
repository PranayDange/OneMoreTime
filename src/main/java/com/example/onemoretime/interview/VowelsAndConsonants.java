package com.example.onemoretime.interview;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowelsCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            } else if (ch >= 'z' && ch <= 'z' ) {
                consonantCount++;
            }

        }
        System.out.println(vowelsCount);
        System.out.println(vowelsCount-consonantCount);
        System.out.println("others" + (vowelsCount-consonantCount));
    }
}
