package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        //   input ans = {1, 2, 3, 4, 5};
        //   output ans = [15]
        int[] arr = {1, 2, 7, 4, 5};
        print(arr);
    }

    static int print(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            // int sum =0;
            // for (int j = i+1; j <arr.length ; j++) {
            ans = ans + arr[i];
           // ans =   arr[i]+ans;
            //arr[i] =sum;
            //  ans=sum;
            //}

        }
        System.out.printf(Arrays.toString(new int[]{ans}));
        return ans;
    }
}
