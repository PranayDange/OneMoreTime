package com.example.onemoretimejava.maths;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n = 9;
        evenOdd(n);
        evenOddWithBitwise(n);
    }

    private static void evenOddWithBitwise(int n) {
        //every number is calculated in binary form internally

        if ((n & 1) == 1) {
            System.out.println(n + " number is odd");
        } else {
            System.out.println(n + " number is even");
        }
    }

    private static void evenOdd(int n) {

        if (n % 2 == 0) {
            System.out.println(n + " number is even");
        } else {
            System.out.println(n + " number is odd");
        }
    }


}
