package com.example.algorithm.sortingalgorithm;

import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {


        // Time Complexity (Iterative & Recursive):
// Best Case: O(n) (when the array is already sorted)
// Worst Case: O(n^2) (when the array is sorted in reverse order)
// Average Case: O(n^2)

// Space Complexity:
// Iterative Insertion Sort: O(1) (no extra space required, as it sorts in place)
// Recursive Insertion Sort: O(n) (due to the recursion stack)

// Stable: YES
// Insertion Sort is stable because it does not swap equal elements unnecessarily, preserving their original order in the input array.

// In-Place: YES
// Insertion Sort works directly within the original array and does not require additional space proportional to the input size.


        int[] arr = {4, 5, 6, 0, 7, 8, 4, 5};
        //insertionSortRecursive(arr, arr.length - 1);

        //insertionSortIterative(arr);
        insertionSortRecusive(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSortIterative(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;

                }
            }
        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void insertionSortRecusive(int[] arr, int n) {
        // Base case: If the array has only one element, it is already sorted.
        if (n <= 1) {
            return;
        }
        insertionSortRecusive(arr, n - 1);
        int last = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }
}
