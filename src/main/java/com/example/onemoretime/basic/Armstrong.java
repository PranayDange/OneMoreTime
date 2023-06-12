package com.example.onemoretime.basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        //370 371
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int originalNum = num;
        int sum = 0;

        int numDigits = String.valueOf(num).length();

        // Find the sum of cubes of digits
        while (num != 0) {
            int digit = num % 10;
            int cube = 1;
            for (int i = 1; i <= numDigits; i++) {
                cube *= digit;
            }
            sum += cube;
            num /= 10;
        }

        // Check if the number is an Armstrong number
        if (originalNum == sum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}