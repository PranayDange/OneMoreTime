package com.example.onemoretimejava.search;

public class SqrtX {
    public static void main(String[] args) {
        int x = 4;
        System.out.println("using LS  " + mySqrtUsingLinearSearch(x));
        System.out.println("using BS  " + mySqrtUsingBinarySearch(x));
    }

    /* public static int mySqrt(int x) {

     }*/
    public static int mySqrtUsingBinarySearch(int x) {
        int low = 1, high = x;
        //Binary search on the answers:
        while (low <= high) {
            long mid = (low + high) / 2;
            long value = mid * mid;
            if (value <= (long)(x)) {
                //eliminate the left half:
                low = (int)(mid + 1);
            } else {
                //eliminate the right half:
                high = (int)(mid - 1);
            }
        }
        return high;
    }

    public static int mySqrt(int x) {
        int low = 1, high = x;
        //Binary search on the answers:
        while (low <= high) {
            long mid = low+(high - low) / 2;
            long value = mid * mid;
            if (value <= (long)(x)) {
                //eliminate the left half:
                low = (int)(mid + 1);
            } else {
                //eliminate the right half:
                high = (int)(mid - 1);
            }
        }
        return high;
    }

    public static int mySqrtUsingLinearSearch(int x) {
        int ans = 1;
        for (int i = 0; i <= x; i++) { //this is linear search
            if (i * i <= x) {
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }
}
