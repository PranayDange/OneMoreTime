package com.example.onemoretimejava.sorting.algo;

import java.util.Arrays;

public class CyclicSort {
    //it has to be continuous array
    public static void main(String[] args) {
        // int[] arr = {3, 5, 2, 1, 4};
        int[] arr = {3, 5, 2, 1, 4, 0};
        //int[] arr = {3, 54, 12, 111, 49};//this will give error as cyclic sort can be implemented in continuous manner
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // int correctIndex = arr[i] - 1;//if zero is not there in array
            int correctIndex = arr[i];//if zero is there in array
            if (arr[i] != arr[correctIndex]) {
                swapArray(arr, i, correctIndex);
            } else {
                i++;
            }

        }
    }

    static void swapArray(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    /*Examples of Problems Suitable for Cyclic Sort
    Finding Missing Number: Given an array containing 𝑛
    n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
    Finding All Missing Numbers: Given an array of integers where 1 ≤ a[i] ≤ n (n = size of the array), find all the integers from 1 to n that do not appear in the array.
    Finding Duplicate Numbers: Given an array of integers where 1 ≤ a[i] ≤ n (n = size of the array), find all the elements that appear more than once.
    Finding First Missing Positive: Given an unsorted integer array, find the smallest missing positive integer.*/
}
