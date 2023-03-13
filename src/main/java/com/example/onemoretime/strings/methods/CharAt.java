package com.example.onemoretime.strings.methods;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);

        String str= sc.nextLine();
        //str.charAt(2);
        System.out.println(str);
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(8));



    }
}

