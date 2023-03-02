package com.example.onemoretime.basic;

import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        System.out.println("enter the values");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
        int p = 1;
        for (int i = 1; i <= power; i++) {
            p = p * num;
        }
        System.out.println(p);
    }
}
