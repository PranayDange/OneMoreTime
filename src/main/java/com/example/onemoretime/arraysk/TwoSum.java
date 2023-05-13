package com.example.onemoretime.arraysk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        //Input: nums = [2,7,11,15], target = 9
        //Output: [0,1]
        int[] nums = {3, 3};
        int terget = 6;
        System.out.println(Arrays.toString(twoSum(nums, terget)));

    }

    static int[] twoSum(int[] nums, int target) {
        int[] ans = {-1, -1};
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            //  int sum = 0;
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] + nums[j]) == target) {
                    ans = new int[]{i, j};
                    break;
                }

            }
        }
        System.out.println("***************************************************");
        // System.out.println(Arrays.toString(ans));
        return ans;
    }
}
