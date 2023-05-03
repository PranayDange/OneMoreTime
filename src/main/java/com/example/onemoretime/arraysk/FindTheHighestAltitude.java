package com.example.onemoretime.arraysk;

import com.jayway.jsonpath.internal.function.numeric.Max;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        //  Input: gain = [-5,1,5,0,-7]    //or   ///-4,-3,-2,-1,4,3,2
        //  Output: 1
        int[] arr = {-4,-3,-2,-1,4,3,2};
        largestAltitude(arr);

    }

    public static int largestAltitude(int[] gain) {
        int ans = 0;
        int res = 0;
        for (int i = 0; i < gain.length; i++) {
            ans = ans + gain[i];
          //  res= Math.max(ans,res);
            //or
            if (ans > res) {
                res = ans;
            }

            //  res= ans+gain[i];
        }
        System.out.println(res);
        return res;

    }
}
