package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        //Input: nums = [2,5,1,3,4,7], n = 3
        //Output: [2,3,5,4,1,7]

        int[] arr = {2, 5, 1, 3, 4, 7};
        int num = 3;
        shuffle(arr, num);

    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int len = ans.length;
        int j = 0;
        for (int i = 0; i < len; i = i + 2) {
            // for(int i = 0;i<len;i=i++){
            ans[i] = nums[j];
            ans[i + 1] = nums[j + n];
            j++;
        }
        System.out.println(Arrays.toString(ans));
        return ans;

    }

    public static int[] shuffle2(int[] nums, int n) {
        int[] arr = new int[2 * n];
        for(int i = 0;i<n;i++){
            arr[2*i]=nums[i];
            arr[2*i+1]=nums[i+n];
        }
        return arr;
    }
}
