package com.example.onemoretimejava.sorting;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums));
        System.out.println(arrayPairSum2(nums));
    }

    public static int arrayPairSum2(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int min = Math.min(nums[i], nums[j]);
                maxSum = Math.max(maxSum, min);
            }
        }
        return maxSum;
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i += 2) {
            ans = ans + nums[i];
        }
        return ans;
    }
}
