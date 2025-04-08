package com.example.algorithm;

import java.util.Arrays;

public class AlgoPractice {
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 0, 7, 8, 4, 5};
        int n = arr.length;
        bubbleSortRecursive(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSortRecursive(int[] arr, int low, int hi) {
        if (low >= hi) {
            return;
        }
        int start = low;
        int end = hi;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        bubbleSortRecursive(arr, low, end);
        bubbleSortRecursive(arr, start,hi);



    }

    static int maxElement(int arr[], int f, int s) {
        int max = f;
        for (int i = 0; i <= s; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int arr[], int f, int e) {
        int temp = arr[f];
        arr[f] = arr[e];
        arr[e] = temp;
    }


}
