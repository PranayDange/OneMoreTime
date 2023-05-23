package com.example.onemoretime.searching.linearsearch;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50, 86, 47, -1, 44};
        // int[] arr = {1,2,3,4,5};
        System.out.println(minNumber(arr));
    }

    static int minNumber(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
