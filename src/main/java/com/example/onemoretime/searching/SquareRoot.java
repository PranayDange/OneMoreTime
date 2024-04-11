package com.example.onemoretime.searching;

public class SquareRoot {
    public static void main(String[] args) {
        int num = 40;
        mySqrt(40);
        mySqrtBS(num);

    }

    //by linear search
    static int mySqrt(int x) {
        int ans = 0;
        while (ans * ans <= x) {

            ans++;
        }
        System.out.println(ans - 1);
        return ans - 1;
    }

    //by binary search
    static int mySqrtBS(int x) {
        int start = 0;
        int end = x / 2;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid <= x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        System.out.println(ans);
        return ans;
    }


}
