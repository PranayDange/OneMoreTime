package com.example.onemoretimejava.search;

import java.util.*;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
       // int[] intersection = intersect(nums1, nums2);
        //System.out.println(Arrays.toString(intersection));
    }

   /* public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    countMap.put(nums2[j]);
                }
            }
        }
        int[] finalArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            finalArray[i] = result.get(i);
        }
        return finalArray;
    }*/
}
