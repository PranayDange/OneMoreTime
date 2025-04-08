package com.example.algorithm.sortingalgorithm;

import java.util.Arrays;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        // Time Complexity iterative: Best Case-- O(n^2), Worst -- O(n^2)
        //Time Complexity of Recursive approach -- Best Case-- O(n^2) Worst -- O(n.sq)

        //Space Complexity of Iterative Bubble Sort --O(1)
        //Space Complexity of Recursive Bubble Sort --O(n)

        //Stable	NO	Does not reorder equal elements (no unnecessary swaps for equal values).
        //In-Place	Yes	Swaps elements directly in the original array, without needing extra space proportional to input.

        int[] arr = {4, 5, 6, 0, 7, 8, 4, 5};
        selectionSortRecursive(arr,arr.length-1);

        //selectionSortIterative(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSortIterative(int[] arr) {
        // int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = maxElement(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int maxElement(int[] arr, int first, int last) {
        int max = first;
        for (int i = first; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }


    static void selectionSortRecursive(int[] arr, int last) {
        if (last == 0) {
            return;
        }

        int maxIndex = maxElement(arr, 0, last);
        swap(arr, maxIndex, last);
        selectionSortRecursive(arr, last - 1);
    }
}
