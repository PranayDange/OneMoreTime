package com.example.onemoretimejava.arrays;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
      /*  Input: nums = [1,2,3,1,1,3]
        Output: 4
        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.*/
        int[] nums = {1, 2, 3, 1, 1, 3};
        numIdenticalPairs(nums);
    }

    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j] && i < j) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
        return ans;
    }
}
