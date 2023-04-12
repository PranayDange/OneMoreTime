package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class ConcatenationOfArray {
    // Input: nums = [1,2,1]
    // Output: [1,2,1,1,2,1]

    // Input: nums = [1,3,2,1]
    // Output: [1,3,2,1,1,3,2,1]
    public static void main(String[] args) {
        int[] nums = {1, 2};
        getConcatenation(nums);

    }

    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int ans[] = new int[2 * n];
        for (int i = 0; i < n; i++) {
            //  ans[i] = nums[i] + nums[i];//this will give additon
           // ans[i+n] == nums[i];
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
        return ans;

    }



}
