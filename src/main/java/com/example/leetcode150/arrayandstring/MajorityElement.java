package com.example.leetcode150.arrayandstring;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }


    public static int majorityElement(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            //System.out.println(count);
            if (count > nums.length / 2) {
                return nums[i];
            }
        }
        return 0;
    }

    //if there is a count and we have to keep a track of how many times it occurs we have to use hashing

    public static int majorityElementUsingHashing(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int maxCount = nums.length / 2;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > maxCount) {
                return nums[i];
            }
        }
        return -1;
    }

}
