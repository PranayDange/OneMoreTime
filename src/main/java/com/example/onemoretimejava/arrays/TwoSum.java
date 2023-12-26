package com.example.onemoretimejava.arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
      /*  Input: nums = [2,7,11,15], target = 9
        Output: [0,1]*/
        int[] nums = {3,2,4};
        int target = 6;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if ((nums[i] + nums[j]) == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }


}

/*
Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]

for example one i am getting right output not for others
*/

