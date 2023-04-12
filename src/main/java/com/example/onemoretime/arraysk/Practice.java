package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        // Input: nums = [1,2,1]
        // Output: [1,2,1,1,2,1]
        int[] p = {1,2,1};
        print(p);
    }

    public static int[] print(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
