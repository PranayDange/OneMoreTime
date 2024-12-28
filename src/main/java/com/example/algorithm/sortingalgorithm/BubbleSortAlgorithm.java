package com.example.algorithm.sortingalgorithm;

import java.util.Arrays;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 0, 7, 8, 4, 5};
        int n = arr.length;
        bubbleSortRecursive(arr, n);
        // bubbleSort(arr);
        //Time Complexity of iterative approach -- Best Case-- O(n) Worst -- O(n.sq)
        //Time Complexity of Recursive approach -- Best Case-- O(n) Worst -- O(n.sq)

        //Space Complexity of Iterative Bubble Sort --O(1)
        //Space Complexity of Recursive Bubble Sort --O(n)

        //Stable	Yes	Does not reorder equal elements (no unnecessary swaps for equal values).
        //In-Place	Yes	Swaps elements directly in the original array, without needing extra space proportional to input.

        //bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }

    static void bubbleSortRecursive(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
        bubbleSortRecursive(arr, n - 1);
    }
}
