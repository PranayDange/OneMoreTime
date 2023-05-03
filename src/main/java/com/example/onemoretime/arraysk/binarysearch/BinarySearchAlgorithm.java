package com.example.onemoretime.arraysk.binarysearch;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 1;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }
    //return the index
    //return -1 if it does not exists

    static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            //find the middle element
            //  int mid = (start + end) / 2;
            //  integer has a fixed size
            //might be possible that (start + end ) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;

    }
}
