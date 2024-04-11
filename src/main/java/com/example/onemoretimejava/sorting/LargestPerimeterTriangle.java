package com.example.onemoretimejava.sorting;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums = {1,2,1,10};
        System.out.println(largestPerimeter(nums));
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                ans = nums[i] + nums[i - 1] + nums[i - 2];
                return ans;
            }
        }
        return ans;
    }
}
