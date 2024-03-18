package com.example.onemoretimejava.sorting;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        //op [1,2,2,3,5,6]
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ansArray = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                ansArray[k] = nums1[i];
                i++;
            } else {
                ansArray[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            ansArray[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            ansArray[k] = nums2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(ansArray));

    }
}
