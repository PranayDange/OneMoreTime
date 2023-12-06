package com.example.onemoretimejava.arrays;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    /*Input: nums = [8,1,2,2,3]
    Output: [4,0,1,1,3]*/
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        smallerNumbersThanCurrent(arr);

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ansArr = new int[n];
        for (int i = 0; i < n; i++) {
            int ans = 0;
            for (int j = 0; j < n; j++) {
                if (j != i && nums[j] < nums[i]) {
                    ans++;
                }
            }
            ansArr[i] = ans;
        }
        System.out.println(Arrays.toString(ansArr));
        return ansArr;
    }
}
