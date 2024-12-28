package com.example.algorithm.searchingalgorithm;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        //in binary search array must be sorted
        // Time Complexity Best --O(1)  Worst--O(logn)

        //Space Complexity - Best --Iterative: O(1) ,,,Recursive: O(logn)
        //Worst--  Iterative:O(1) ,,,,Recursive:O(logn)


        //binarySearch
        /*int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 11;
        int ans = binarySearch(arr, target);
        System.out.println(ans);*/

        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 18, 45};
        int[] arr2 = {99, 95, 83, 76, 70, 67, 66, 63, 56, 52};
        int target = -4;
        int ans = binarySearchOrderRecursively(arr, target, 0, arr.length - 1);
        int ans2 = binarySearchOrderAgustic(arr, target);
        System.out.println(ans);
        System.out.println("---------------------------");
        System.out.println(ans2);

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
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

    static int binarySearchOrderAgustic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }


    static int binarySearchOrderRecursively(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;//base case element not found
        }
        int mid = start + (end - start) / 2; // Calculate mid to avoid overflow

        if (target == arr[mid]) {
            return mid; // Base case: element found
        } else if (target < arr[mid]) {
            // Recursive case: search in the left half
            return binarySearchOrderRecursively(arr, target, start, mid - 1);
        } else {
            // Recursive case: search in the right half
            return binarySearchOrderRecursively(arr, target, mid + 1, end);
        }
    }


}
