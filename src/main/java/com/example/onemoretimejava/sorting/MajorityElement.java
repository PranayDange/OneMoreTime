package com.example.onemoretimejava.sorting;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {8, 8, 7, 7, 7};
        int i = majorityElement(nums);
        System.out.println(i);
    }

    public static int majorityElement(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > (nums.length / 2)) {
                return nums[i];
            }
        }

        return -1;
        //here complexity is 0(n.sq)
    }


    //by using hashing
   /* public static int majorityElementHashing(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

        }
    }*/
}

