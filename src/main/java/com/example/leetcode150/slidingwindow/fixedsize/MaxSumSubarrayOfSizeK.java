package com.example.leetcode150.slidingwindow.fixedsize;

public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {
//Input: arr[] = [100, 200, 300, 400] , k = 2
//Output: 700

        int[] arr = {100, 200, 300, 400};
        int k = 2;
        int i = maximumSumSubarray(arr, k);
        System.out.println(i);
    }

    public static int maximumSumSubarray(int[] arr, int k) {

        int i = 0;
        int j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while (j < arr.length) {
            sum = sum + arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(max, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }

        }
        return max;
    }
}
