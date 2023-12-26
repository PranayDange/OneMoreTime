package com.example.onemoretimejava.arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        // int[] arr = {5, 4, -1, 7, 8};//23
        // int[] arr = {1};//1
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};//6
        // maxSubArray1(arr);
       // maxSubArray2(arr);
         maxSubArray1(arr);
    }

    public static int maxSubArray1(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum = currentSum + nums[k];
                }
                maxSum = Math.max(maxSum, currentSum);

            }
        }
        System.out.println(maxSum);
        return maxSum;
    }

    public static int maxSubArray2(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.println(maxSum);
        return maxSum;
    }

    public static int maxSubArray3(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
        return maxSum;
    }
}
