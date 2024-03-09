package com.example.onemoretimejava.sorting;

public class MissingNumber {
    // https://leetcode.com/problems/missing-number/description/
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int i = missingNumber(nums);
        System.out.println(i);
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        //search for first missing number
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    private static void swap(int[] nums, int i, int correctIndex) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;

    }

}
