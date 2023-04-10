package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class RunningSumOf1dArray {
    // Input: nums = [1,2,3,4]
    //  Output: [1,3,6,10]
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        runningSum(nums);

    }


    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            //   sum = nums[i];
            // ans[i] = nums[i] + sum;
            sum = nums[i] + sum;
            ans[i] = sum;
        }
        System.out.println(Arrays.toString(ans));
        return ans;


    }
}
