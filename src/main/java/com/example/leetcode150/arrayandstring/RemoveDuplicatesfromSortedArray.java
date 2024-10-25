package com.example.leetcode150.arrayandstring;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    nums[count] = nums[i];
                    count++;
                }
            }
            ans = count;
        }
        return ans;
    }

    public static int removeDuplicates3(int[] nums) {
        if (nums.length == 0) return 0;

        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }


    public static int removeDuplicates2(int[] nums) {
        if (nums.length == 0) return 0;
        return removeDuplicatesHelper(nums, 1, 1);
    }

    private static int removeDuplicatesHelper(int[] nums, int currentIndex, int uniqueIndex) {
        if (currentIndex == nums.length) {
            return uniqueIndex;  // Return the count of unique elements.
        }

        // If current element is not equal to the previous element, it's unique.
        if (nums[currentIndex] != nums[currentIndex - 1]) {
            nums[uniqueIndex] = nums[currentIndex];  // Place it in the correct position.
            uniqueIndex++;
        }

        // Move to the next element.
        return removeDuplicatesHelper(nums, currentIndex + 1, uniqueIndex);
    }
}
