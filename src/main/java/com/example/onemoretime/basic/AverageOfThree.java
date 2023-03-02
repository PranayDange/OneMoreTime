package com.example.onemoretime.basic;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        //enter three numbers
        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d =(double) (a + b + c) / 3;
        System.out.println(d);
    }
}
