package com.example.onemoretimejava.arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        // int[] arr = {5, 4, -1, 7, 8};//23
        // int[] arr = {1};//1
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};//6
        // maxSubArray1(arr);
       // maxSubArray2(arr);
         maxSubArray1(arr);

        int n = arr.length;
        System.out.println("Maximum subarray sum is " + maxSubarraySum(arr, n));
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
    public static long maxSubarraySumS(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    }
    public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // Maximum sum
        long sum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
                start = tempStart;
                end = i;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }

        // To consider the sum of the empty subarray
        // Uncomment the following check if needed:
        // if (maxi < 0) maxi = 0;

        // Print the elements of the maximum subarray
        System.out.print("Maximum subarray elements: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return maxi;
    }



}
