package com.example.onemoretimejava.search.binary;

public class Basic {
    public static void main(String[] args) {
        //Array must be sorted in binary search
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 18, 45};
        int target = 0;
        int ans = indexNumber(arr, target);
        System.out.println(ans);
    }

    //return the index
    static int indexNumber(int[] arr, int target) {
        // int ans = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //find the middle element
            int mid = (start + (end - start) / 2);
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
