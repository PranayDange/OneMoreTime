package com.example.onemoretimejava.maths.part2;

public class FactorsOfANumber {
    public static void main(String[] args) {
        int n = 20;
       // allFactors(n);
        allFactors2(n);
    }

    private static void allFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + ",");
            }
        }
    }

    private static void allFactors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");

                } else {

                    System.out.print(i + " " + n / i +" ");
                }
            }
        }
    }
}
