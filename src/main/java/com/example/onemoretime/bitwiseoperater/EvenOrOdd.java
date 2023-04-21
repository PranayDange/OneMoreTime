package com.example.onemoretime.bitwiseoperater;

public class EvenOrOdd {
    public static void main(String[] args) {
        int  num = 67;
        printEvenOrOdd(num);
        System.out.printf(String.valueOf(printEvenOrOdd(num)));
    }

    static boolean printEvenOrOdd(int n){
        return (n & 1)==1;
    }
}
