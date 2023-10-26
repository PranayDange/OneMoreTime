package com.example.onemoretimejava.basic;

public class EvenOrOdd {
    public static void main(String[] args) {
        evenOrOdd(0);
    }

    static void evenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}
