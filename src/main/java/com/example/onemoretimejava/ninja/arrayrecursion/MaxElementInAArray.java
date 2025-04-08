package com.example.onemoretimejava.ninja.arrayrecursion;

public class MaxElementInAArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
        System.out.println(maxElement(arr, 0));
    }

    static int maxElement(int[] arr, int si) {
        if (si == arr.length - 1) {
            return arr[si];
        }
        int i = maxElement(arr, si + 1);
        return Math.max(arr[si], i);
    }
}
