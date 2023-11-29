package com.example.onemoretimejava.arrays;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
       /* Input: nums = [1,2,3,4]
        Output: [1,3,6,10]*/
        int[] arr = {1, 2, 3, 4};
        runningSum(arr);
    }

    static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] newArr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            newArr[i] = sum + newArr[i];
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }
}
