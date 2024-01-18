package com.example.onemoretimejava.search.binary;

public class CeilingOfANumber {
    public static void main(String[] args) {
        //smallest number greater or equal to target number

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 105;

        int ans = numberFoundOrNot(arr, target);
        System.out.println(ans);
    }

    /*static int ceilingNumber(int[] arr, int target) {
        int ans = 0;
        if (numberFoundOrNot(arr, target)) {
            return target;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target) {

            }
        }
        return
    }*/


    static int numberFoundOrNot(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return end;
    }
}
