package com.example;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        int i = majorityElement(arr);
        System.out.println(i);
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {

            //  for(int j=0;j<n;j++){
            if (nums[i] == nums[i + 1]) {
                count++;
            }

            // }
            if (count > n / 2) {
                return nums[i];
            }
        }
        return count;
    }
}
