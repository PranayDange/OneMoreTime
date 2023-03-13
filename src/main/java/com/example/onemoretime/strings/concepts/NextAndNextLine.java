package com.example.onemoretime.strings.concepts;

import java.util.Scanner;

public class NextAndNextLine {
    public static void main(String[] args) {
        System.out.println("enter your name :");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);

        System.out.println("--------------------------------------------------------------------------");


        System.out.println("enter your name :");
        Scanner scc = new Scanner(System.in);
        String namefull = scc.nextLine();
        System.out.println(namefull);




    }
}
