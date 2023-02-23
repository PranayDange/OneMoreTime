package com.example.onemoretime.flowcharts;

import com.intellij.openapi.util.ScalableIcon;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {

        //largest of three numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println(a);
        } else if ((b > a) && (b > c)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
