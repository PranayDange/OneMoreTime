package com.example.onemoretimejava.search;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        twoSum(arr, target);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j =i+ 1; j < numbers.length; j++) {
                if ((numbers[i] + numbers[j]) == target) {
                   ans[0]=i;
                   ans[1]=j;
                    return ans;
                }
            }

        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
