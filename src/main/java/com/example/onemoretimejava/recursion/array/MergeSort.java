package com.example.onemoretimejava.recursion.array;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 12, 5, 6, 3, 55, 69};
        // mergeSort(arr);
        //System.out.println(Arrays.toString(mergeSort(arr)));
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    //for merging left and right
    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
                // k++;
            } else {
                mix[k] = second[j];
                j++;
                //  k++;
            }
            k++;
        }

        //it may be possible that the one of the array is not complete
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


    /////in place
    static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    //for merging left and right
    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
                // k++;
            } else {
                mix[k] = arr[j];
                j++;
                //  k++;
            }
            k++;
        }

        //it may be possible that the one of the array is not complete
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

    }
}
