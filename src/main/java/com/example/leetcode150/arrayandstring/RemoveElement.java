package com.example.leetcode150.arrayandstring;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                ans.add(nums[i]);
            }
        }

        return ans.size();
    }

    //if they ask to use inplace the use same array without creating a new one
    public int removeElement2(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
