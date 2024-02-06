package com.example.onemoretimejava.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] intersection = intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
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
        int[] intersectionArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersectionArray[i] = result.get(i);
        }
        return intersectionArray;
    }
}
