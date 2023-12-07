package com.example.onemoretimejava.arrays;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
       /* Input: gain = [-5,1,5,0,-7]
        Output: 1*/
        int[] arr = {-5, 1, 5, 0, -7};
        largestAltitude(arr);
    }

    public static int largestAltitude(int[] arr) {
        int ans = 0;
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            ans = ans + arr[i];
            res = Math.max(res, ans);
        }
        System.out.println(res);
        return res;
    }
}
