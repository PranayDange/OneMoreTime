package com.example.onemoretime.interview;

public class Practice {
    public static void main(String[] args) {
        output(8);
        output2(8);
    }

    static int output(int n) {
        int ans = 0;
        while (ans * ans <= n) {
            ans++;
        }
        System.out.println(ans - 1);
        return ans - 1;
    }

    static int output2(int n) {
        int x = 0;
        int y = n / 2;
        int ans = 0;
        while (x <= y) {
            int mid = x + (y - x) / 2;
            if (mid * mid <= n) {
                ans = mid;
                x = mid + 1;
            } else {
                y = mid - 1;
            }
        }
        System.out.println(ans);
        return ans;
    }
}
