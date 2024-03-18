package com.example.onemoretimejava.sorting;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        intersection(nums1, nums2);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!result.contains(nums1[i])) {
                        result.add(nums1[i]);
                    }

                }
            }
        }
        int[] ansArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ansArray[i] = result.get(i);
        }
        return ansArray;
    }
}
