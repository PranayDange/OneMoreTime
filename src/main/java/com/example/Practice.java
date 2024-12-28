package com.example;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        bubbleSortRecursion(arr, arr.length - 1, 0);
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

    static void bubbleSortRecursion(int[] arr, int remainingLength, int currentIndex) {
        // Base case: If the remaining length of the array to sort is 0, stop recursion
        if (remainingLength == 0) {
            return;
        }

        // Inner loop logic: If the current index is within bounds
        if (currentIndex < remainingLength - 1) {
            // Swap adjacent elements if they are in the wrong order
            if (arr[currentIndex] > arr[currentIndex + 1]) {
                int temp = arr[currentIndex];
                arr[currentIndex] = arr[currentIndex + 1];
                arr[currentIndex + 1] = temp;
            }
            // Recursive call to continue the inner loop
            bubbleSortRecursion(arr, remainingLength, currentIndex + 1);
        } else {
            // Outer loop logic: Move to the next pass and reset the inner loop
            bubbleSortRecursion(arr, remainingLength - 1, 0);
        }
    }


}


