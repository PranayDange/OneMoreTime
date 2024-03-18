package com.example.onemoretimejava.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
       // System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicateHash(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 1) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicateHash(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }


    //wrong approach
    public static boolean containsDuplicate1(int[] nums) {
        //boolean ans = true;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i && nums[i] < nums.length) {
                int correctIndex = nums[i];
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    return true;
                }
            } else {
                i++;
            }
        }
        return false;
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
