package com.example.algorithm;

import java.util.Arrays;

public class AlgoPractice {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 0, 7, 8, 4, 5};

        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        int maxIndex = maxElement(arr, 0, n - 1);
        swap(arr, maxIndex, n - 1);
        selectionSort(arr, n - 1);
    }

    static int maxElement(int[] arr, int first, int second) {
        int max = first;
        for (int i = first; i <= second; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void quickSort(int[] arr, int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            while (s <= e) {
                swap(arr, s, e);
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, hi);
    }


    static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }


}
