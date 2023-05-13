package com.example.onemoretime.arraysk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        //Input: num = [1,2,0,0], k = 34
        //Output: [1,2,3,4]
        //Explanation: 1200 + 34 = 1234
        int k = 34;
        int[] num = {1, 2, 0, 0};
        addToArrayForm(num, k);

    }

    // static List<Integer> addToArrayForm(int[] num, int k) {
    static int[] addToArrayForm(int[] num, int k) {
        int n = num.length - 1;
        int ans = 0;
        List<Integer> answer = new ArrayList<>();
        for (int i = n; i >= 0; i--) {
            num[i] = k;
            break;
        }

        System.out.println(Arrays.toString(num));
        return num;

    }
}
