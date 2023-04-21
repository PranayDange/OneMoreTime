package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        //  Input: nums = [1,2,3,1,1,3]
        // Output: 4
        int[] number = {1, 2, 3, 1, 1, 3};
        numIdenticalPairs(number);

    }

    public static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ans++;
                }
            }
        }
        System.out.println(Arrays.toString(new int[]{ans}));
        return ans;

    }
}
