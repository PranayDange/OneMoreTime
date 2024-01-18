package com.example.onemoretimejava.search.binary;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 18, 45};
        int[] arr2={99,95,83,76,70,67,66,63,56,52};
        int target = 95;
        int ans = orderAgnostic(arr2, target);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find weather the array is sorted in ascending or in descending
        /*boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false
        }*/
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            //find the middle element
            int mid = (start + (end - start) / 2);

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
}
