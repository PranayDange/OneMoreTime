package com.example.algorithm.sortingalgorithm;

import java.util.Arrays;

public class QuickSortAlgorithm {
    public static void main(String[] args) {
        // Time Complexity (Iterative & Recursive):
// Best Case: O(n log n) (when the pivot divides the array into two nearly equal halves)
// Worst Case: O(n^2) (when the pivot always picks the largest or smallest element, e.g., sorted array)
// Average Case: O(n log n)

// Space Complexity:
// Iterative Quick Sort: O(log n) (due to the stack used for iterative partitioning)
// Recursive Quick Sort: O(log n) on average (for the recursion stack in balanced partitions)
//                     O(n) in the worst case (for the recursion stack in unbalanced partitions)

// Stable: NO
// Quick Sort is not stable because it may rearrange equal elements while swapping them around the pivot.

// In-Place: YES
// Quick Sort works directly within the original array and does not require additional space proportional to the input size (apart from the stack space).


        //merge sort is better in linked list  due to memory allocation


        int[] arr = {5, 4, 3, 2, 1};
        sortQuick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    //here pivot element taken as mid element
    //pivot element can be any element
    //choose any element after first pass all the elements less than first will be on left side
    //and greater on right hand side



    static void sortQuick(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }
        //s start e--end
        int s = low;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = nums[mid];
        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        //now my pivot is at correct index,please sort the two half now
        sortQuick(nums, low, e);
        sortQuick(nums, s, hi);
    }
}
