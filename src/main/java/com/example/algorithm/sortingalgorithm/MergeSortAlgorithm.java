package com.example.algorithm.sortingalgorithm;

import java.util.Arrays;

public class MergeSortAlgorithm {
    public static void main(String[] args) {

        // Time Complexity:
// Best Case: O(n log n) (achieved for all cases as it always divides the array into halves and merges them)
// Worst Case: O(n log n) (same as best case because the structure of the algorithm doesn't change based on input)
// Average Case: O(n log n)

// Space Complexity:
// Iterative Merge Sort: O(n) (additional temporary array is required to merge sorted subarrays)
// Recursive Merge Sort: O(n) + O(log n) = O(n) (O(n) for temporary array + O(log n) for recursion stack)

// Stable: YES
// Merge Sort is stable because it maintains the relative order of equal elements during the merging process.

// In-Place: NO
// Merge Sort requires extra space proportional to the size of the input array for the temporary array used during merging.

        int[] arr = {5, 4, 3, 2, 1, 0, 7};
        //arr = mergeRecursive(arr);
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergeRecursive(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeRecursive(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeRecursive(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array is not complete
        //copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;

    }

    //In place use the original array and modify that only

    static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        // int mid = start + (end - start) / 2;
        int mid = (start + end) / 2;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array is not complete
        //copy the remaining elements
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
        //or
        // System.arraycopy(mix, 0, arr, start + 0, mix.length);

    }
}
