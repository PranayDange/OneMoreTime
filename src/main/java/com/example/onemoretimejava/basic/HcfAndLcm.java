package com.example.onemoretimejava.basic;

public class HcfAndLcm {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        findHcf(a, b);
        findLcm(a, b);
    }

    static int findHcf(int a, int b) {
        int gcd = 1;
        int max = Math.max(a, b);
        for (int i = 1; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("hcf: " + gcd);
        return gcd;
    }

    static int findLcm(int a, int b) {
        int lcm = 1;
        lcm = a * b / findHcf(a, b);
        System.out.println("lcm: " + lcm);
        return lcm;
    }
}

