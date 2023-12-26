package com.example.onemoretimejava.arrays;

import jnr.ffi.annotations.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArrayFormOfInteger {
    /*  Input: num = [1,2,0,0], k = 34
      Output: [1,2,3,4]
      Explanation: 1200 + 34 = 1234*/
    public static void main(String[] args) {
        int k = 34;
        int[] arr = {1, 2, 0, 0};
        addToArrayForm(arr, k);

    }

    public static String addToArrayForm(int[] num, int k) {
        int n = num.length;
        List arr = new ArrayList<Integer>();

        int sum = 0;
        for (int i = 0; i < n; i++) {
           // sum = sum + num[i] * (int) Math.pow(10, n - 1 - i);
            //or
            sum = sum *10 +num[i];
        }
        sum = sum + k;
        while (sum != 0) {
            int digit = sum % 10;
            arr.add(0, digit);
            sum = sum / 10;

        }
        System.out.println(arr);
        // System.out.println(Arrays.toString(new int[]{sum}));
        return Arrays.toString(new int[]{sum});
    }
}

/*num =
        [9,9,9,9,9,9,9,9,9,9]
        k =
        1*/
