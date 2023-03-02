package com.example.onemoretime.basic;

import java.util.Scanner;

public class TotalSalary {

    /*    Total Salary
        Send Feedback
        Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade
        (an uppercase character), and depending upon which the total salary is calculated as -
        totalSalary = basic + hra + da + allow – pf
        where :
        hra   = 20% of basic
        da    = 50% of basic
        allow = 1700 if grade = ‘A’
        allow = 1500 if grade = ‘B’
        allow = 1300 if grade = ‘C' or any other character
        pf    = 11% of basic.
        Round off the total salary and then print the integral part only.
        Note: Try finding out a function on the internet to do so*/
    public static void main(String[] args) {
        //double basic, hra, da, allow, pf;
        System.out.println("enter the basic salary");
        Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();
        System.out.println("Enter Grade");
        char grade = sc.next().charAt(0);
        double hra = 0.20 * basic;
        double da = 0.50 * basic;
        double pf = 0.11 * basic;
        double allow;
        if (grade == 65) {
            allow = 1700;
        } else if (grade == 66) {
            allow = 1500;
        } else {
            allow = 1300;
        }
        double totalSalary = Math.round(basic + hra + da + allow - pf);
        System.out.println(totalSalary);


    }
}
