package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        // Input: nums = [8,1,2,2,3]
        // Output: [4,0,1,1,3]
        int number[] = {8, 1, 2, 2, 3};
        smallerNumbersThanCurrent(number);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] > nums[j] ) {
                    sum++;
                }

            }
            ans[i] = sum;
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
