package com.example.onemoretime.arraysk;

import jnr.ffi.annotations.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        //   input ans = {1, 2, 3, 4, 5};
        //   output ans = [15]
        int[] ansA = {1, 2, 3, 4, 5};
        printArraySum(ansA);

    }

    static int printArraySum(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+ans;
            ans=arr[i];
        }
        System.out.println(ans);
        return ans;
    }


}

