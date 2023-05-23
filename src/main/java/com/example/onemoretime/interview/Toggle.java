package com.example.onemoretime.interview;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int ch = sb.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch + 32));
            } else if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 32));
            } else {
                sb.append(ch);
            }

        }
        String res = sb.toString();
        System.out.println(res);
    }
}
