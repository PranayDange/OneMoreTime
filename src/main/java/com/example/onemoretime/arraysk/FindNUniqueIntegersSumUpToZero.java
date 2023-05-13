package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        // Input: n = 5
        // Output: [-7,-1,1,3,4]
        // Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
        int n = 5;
        sumZero(5);

    }

    static int[] sumZero(int n) {
        int[] arr = new int[n];
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i = i + 2) {
                arr[i] = i + 1;
                arr[i + 1] = -(i + 1);
            }
        } else {
            for (int i = 0; i < n - 1; i = i + 2) {
                arr[i] = i + 1;
                arr[i + 1] = -(i + 1);
            }
            arr[n - 1] = 0;
        }
       // System.out.println(Arrays.toString(arr));
        return arr;
    }
}
