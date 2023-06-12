package com.example.onemoretime.basic;

public class HcfLcm {

    //HCF
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        int hcf = findHCF(num1, num2);
        int lcm = findLCM(num1, num2);

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
    }

    static int findHCF(int a, int b) {
        int gcd = 1;
        int min = (a > b) ? a : b;
      //  int min = Math.max(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    static int findLCM(int a, int b) {
        int lcm = 1;
        lcm=(a*b)/findHCF(a,b);
        return lcm;
    }
}
