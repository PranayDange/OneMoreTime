package com.example.onemoretimejava.ninja.arrayrecursion;

public class FindTheLastOccurrenceOfAnElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
        int target = 3;
        System.out.println(lastOccur(arr, 0, target));
    }

    static int lastOccur(int[] arr, int si, int target) {
        if (si == arr.length) {
            return -1;
        }
        return 1;

    }
}
