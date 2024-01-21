package com.example.onemoretimejava.search;

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoinsOptimized(5));  // Output: 2
        System.out.println(arrangeCoinsOptimized(8));  //
    }

    public static int arrangeCoinsOptimized(int n) {
        long start = 1, end = n;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long total = mid * (mid + 1) / 2;

            if (total == n) {
                return (int) mid;
            } else if (total < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return (int) end;  // When the loop ends, end will be the maximum number of complete rows
    }
}
