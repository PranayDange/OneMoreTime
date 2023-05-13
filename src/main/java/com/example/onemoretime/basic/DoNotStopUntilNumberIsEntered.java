package com.example.onemoretime.basic;

import java.util.Scanner;

public class DoNotStopUntilNumberIsEntered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int target = 5;
        while (num == target) {

            break;

        }
    }
}
