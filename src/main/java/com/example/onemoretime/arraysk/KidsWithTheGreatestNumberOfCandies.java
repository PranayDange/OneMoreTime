package com.example.onemoretime.arraysk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class
KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        // Input: candies = [2,3,5,1,3], extraCandies = 3
        // Output: [true,true,true,false,true]
        //  Input: candies = [4,2,1,1,2], extraCandies = 1
        // Output: [true,false,false,false,false]
        int[] arr = {2, 3, 5, 1, 3};
        int num = 3;
        kidsWithCandies(arr, num);

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i <= candies.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j <= candies.length-1; j++) {
                if (candies[i] + extraCandies < candies[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                ans.add(false);
                break;
            } else {
                ans.add(true);

            }

        }
        System.out.println(Arrays.toString(new List[]{ans}));
        return ans;
    }
}
