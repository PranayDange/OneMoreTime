package com.example.onemoretimejava.arrays;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        removeDuplicates(arr);
    }

    /*public static int removeDuplicates(int[] nums) {
        int totEle = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[totEle] != nums[i]) {
                totEle++;
                nums[totEle] = nums[i];
            }
        }
        System.out.println(totEle + 1);
        return totEle + 1;
    }*/

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int ans = 0;

        // Use a HashSet to track unique elements
        HashSet<Integer> uniqueSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (uniqueSet.add(nums[i])) {
                // If the element is added to the HashSet, it is unique
               nums[ans++] = nums[i];
               // ans++;
            }
            //uniqueSet.add(nums[i]);
        }
        System.out.println(uniqueSet.size());
        return uniqueSet.size();
    }


}
