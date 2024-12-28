package com.example.onemoretime.ninja.dp;

public class Basic01 {
    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        System.out.println(fibo(n, dp));
        System.out.println("papadpadpapdapd");
        System.out.println(fibo(n));

    }

    //recursive +DP approach
    public static int fibo(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        int one, two;
        if (dp[n - 1] == -1) {
            one = fibo(n - 1, dp);
            dp[n - 1] = one;
        } else {
            one = dp[n - 1];
        }

        if (dp[n - 2] == -1) {
            two = fibo(n - 2, dp);
            dp[n - 2] = two;
        } else {
            two = dp[n - 2];
        }


        int sum = one + two;
        return sum;
    }

    //Iterative approach
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        //n>=2
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
