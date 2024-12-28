package com.example.onemoretime.ninja.basic;

public class XToThePowerN03 {
    public static void main(String[] args) {
        //System.out.println(power(0, 0));
        System.out.println(power1(2, 3));
    }

    public static int power(int x, int n) {

        if (n == 1) {
            return x;
        }
        int smallOutput = power(x, n - 1);
        if (smallOutput == 0) {
            return 0;
        }
        int ans = x * smallOutput;
        return ans;
    }

    public static int power1(int x, int n) {
        if (x == 0 && n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }


        int smallOutput = power(x, n - 1);
        int ans = x * smallOutput;
        return ans;
    }


}
