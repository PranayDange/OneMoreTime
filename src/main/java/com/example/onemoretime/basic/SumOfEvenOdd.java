package com.example.onemoretime.basic;

import java.util.Scanner;

public class SumOfEvenOdd {
    /*    Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
        Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.*/
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;

        while (num > 0) {
            int e = num % 10;
            num = num / 10;
            if (e % 2 != 0) {
                odd = odd + e;
            } else {
                even = even + e;
            }
        }
        System.out.println(odd + "  " + even);

    }
}
