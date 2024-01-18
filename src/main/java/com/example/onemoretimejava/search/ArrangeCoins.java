package com.example.onemoretimejava.search;

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoinsOptimized(5));  // Output: 2
        System.out.println(arrangeCoinsOptimized(8));  //
    }

    public static int arrangeCoinsOptimized(int n) {
        long left = 0, right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long total = mid * (mid + 1) / 2;

            if (total == n) {
                return (int) mid;
            } else if (total < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) right;  // When the loop ends, right will be the maximum number of complete rows
    }
}
