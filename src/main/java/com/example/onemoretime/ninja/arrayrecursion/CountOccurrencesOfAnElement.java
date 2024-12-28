package com.example.onemoretime.ninja.arrayrecursion;

public class CountOccurrencesOfAnElement {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 2, 8, 2, 3};
        int target = 2;
        System.out.println(occurence(arr, 0, target));
    }

    static int occurence(int[] arr, int si, int target) {
        if (si == arr.length) {
            return 0;
        }
        int count = 0;
        if (arr[si] == target) {
            count = 1;
        }
        return count + occurence(arr, si + 1, target);
    }
}
