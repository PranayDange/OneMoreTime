package com.example.algorithm;

public class AlgoPractice {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 18, 45};
        int[] arr2 = {99, 95, 83, 76, 70, 67, 66, 63, 56, 52};
        int target = -4;
        int ans = binarySearchOrderRecursively(arr, target, 0, arr.length - 1);
        // int ans2 = binarySearchOrderAgustic(arr, target);
        System.out.println(ans);
        System.out.println("---------------------------");
        //System.out.println(ans2);
    }

    static int binarySearchOrderRecursively(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return binarySearchOrderRecursively(arr, target, start, mid - 1);
        } else {
            return binarySearchOrderRecursively(arr, target, mid + 1, end);
        }


    }
}
