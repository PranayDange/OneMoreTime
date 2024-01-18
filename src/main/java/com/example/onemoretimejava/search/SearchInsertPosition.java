package com.example.onemoretimejava.search;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        // searchInsert(nums, target);
        searchInsertB(nums, target);
    }

    public static int searchInsert(int[] nums, int target) {
        List<Integer> ss = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans = i;
                break;
            } else {
                ss.add(i);
                List<Integer> sortedIndices = ss.stream().sorted().collect(Collectors.toList());
                int pos = sortedIndices.indexOf(i);
                if (pos >= 0 && sortedIndices.get(pos) == target) {
                    ans = i;
                    break;
                    // return i; // Target found in the sorted list of indices
                }
                //System.out.println(collect);
                // ans=i;
                // ss.add(i);
            }
        }
        System.out.println(ans);
        return ans;

    }

   /* int ans = 0;

        for (int i = 0; i < nums.length; i++) {
        if (nums[i] == target) {
            return i; // Target found at index i
        } else if (nums[i] < target) {
            ans = i + 1; // Target should be inserted after index i
        }
    }

        System.out.println(ans);
        return ans;*/

    public static int searchInsertB(int[] nums, int target) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // Target found at index i
            } else if (nums[i] < target) {
                ans = i + 1; // Target should be inserted after index i
            }
        }

        System.out.println(ans);
        return ans;

    }

    public static int searchInsertO(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // Target found at index mid
            } else if (nums[mid] < target) {
                start = mid + 1; // Target must be in the right half
            } else {
                end = mid - 1; // Target must be in the left half
            }
        }

        return start;
    }
}
