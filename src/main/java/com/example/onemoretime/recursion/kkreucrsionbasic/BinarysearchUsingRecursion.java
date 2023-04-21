package com.example.onemoretime.recursion.kkreucrsionbasic;

public class BinarysearchUsingRecursion {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 55, 66, 78};
        int target = 4;

        System.out.println(search(arr, target, 0, arr.length - 1));

    }

    static int search(int[] arr, int target, int s, int e) {
        // int s =0;
        // int e = arr.length-1;
        //we have to take this in argument(s and e) as when will call this function again
        //how will you pass this in future calls
        //whatever variables you need to pass on future calls put that it in agruments


        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }

        return search(arr, target, m + 1, e);

    }
}
