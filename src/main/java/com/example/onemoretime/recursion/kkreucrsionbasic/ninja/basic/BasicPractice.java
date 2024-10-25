package com.example.onemoretime.recursion.kkreucrsionbasic.ninja.basic;

public class BasicPractice {
    public static void main(String[] args) {
        //# Basic Problems
        //1. factorial
        //2.sum
        //3.powerOf
        //4.print numbers in ascending and des
        //5.number of digits //R
        //6.fibo
        //7.checkPalindrome
        //8.countzeros //R
        //9.calculateexponentialsum
        //10.convertdecimaltobinary
        //11.geomatricsum
        //12.log2base
        //13.multiplicationofnumbers
        //14.reverse a string
        //15.sumofdigits
        //16.sumofevendigits
        //17.sumofseries


        System.out.println(sumOfDigits(6));

    }


    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
       // int i = n % 10;
        return n + sumOfDigits(n -1);


    }


}
