package com.example.onemoretimejava.arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(arr);
    }

    public static int removeDuplicates(int[] nums) {
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
    }
}
