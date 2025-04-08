package com.example.algorithm.twopointersapproach;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 4, 6, 10, 13};
        int m = 5;
        int[] nums2 = {2, 5, 7, 9};
        int n = 4;

        int[] mergeddd = merge(nums1, nums2);
        System.out.println(Arrays.toString(mergeddd));
    }

    static int[] merge(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] newArr = new int[m + n];

        // System.arraycopy(nums1, 0, newArr, 0, m);
        //System.arraycopy(nums2, 0, newArr, m, n);
        /*for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < numw2.length; j++) {
                newArr[i] = Math.min(nums1[i], numw2[j]);
            }
        }
        return newArr;*/

       /* for (int i = 0; i < nums1.length; i++) {
            newArr[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            newArr[i+m] = nums2[i];
        }
        */

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                newArr[k] = nums1[i];
                i++;
                k++;
            } else {
                newArr[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < m) {
            newArr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            newArr[k] = nums2[j];
            j++;
            k++;
        }

        return newArr;

    }
}
