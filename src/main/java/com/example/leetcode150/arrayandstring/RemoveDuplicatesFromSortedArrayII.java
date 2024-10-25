package com.example.leetcode150.arrayandstring;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int count = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[count - 1]) {
                count++;
                nums[count] = nums[i];
            }
        }

        return count + 1;
    }


}
