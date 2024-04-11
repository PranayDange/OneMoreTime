package com.example.onemoretimejava.recursion.basic;

public class SumOfDigitsUsingRecursion4 {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sumOfADigitsUsingRecursion(n));
        System.out.println(productOfADigitsUsingRecursion(n));
    }

    static int sumOfADigitsUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfADigitsUsingRecursion(n / 10);
    }
   /* Suppose n = 1342.
    The function starts with n = 1342.
    It extracts the last digit 2 using (n % 10) and adds it to the sum of the remaining digits obtained by sumOfADigitsUsingRecursion(n / 10).
    The recursive call sumOfADigitsUsingRecursion(134) is made.
    This process continues until n becomes 0, at which point the function returns 0, and the recursion unwinds, adding up the digits along the way.
    The final result is the sum of all the digits in the original number n, which is printed in the main method.*/

    static int productOfADigitsUsingRecursion(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * productOfADigitsUsingRecursion(n / 10);
    }
}
