package com.example.onemoretime.arraysk;

import jnr.ffi.annotations.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};
        int num = 3;
        kidsWithCandies(arr, num);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> candi = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies < candies[i]) {
                flag = true;
            }
        }
        if (flag) {
            candi.add(false);
        } else {
            candi.add(true);
        }
        System.out.println(Arrays.toString(new List[]{candi}));
        return candi;

    }

}

