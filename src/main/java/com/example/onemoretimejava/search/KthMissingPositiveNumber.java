package com.example.onemoretimejava.search;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        // Input: arr = [2,3,4,7,11], k = 5
        // Output: 9
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        int ans = findKthPositive(arr, k);
        System.out.println(ans);
    }

    public static int findKthPositive(int[] arr, int k) {
        int ans = 0;
        for (int i = 0; i < arr.length * 2; i++) {
            for (int j = 0; j < arr.length; j++) {

            }
        }
        return ans;
    }
    /* public static int findKthPositive(int[] arr, int k) {
     *//*int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] <= k) {
                k++;
            } else {
                break;
            }
        }

        return n;*//*
        int n = arr.length;
        int i = 0;

        while (i < n && arr[i] <= k) {
            k++; // Increment k when the current array element is less than or equal to k
            i++;
        }

        return k;
    }*/
}
