package com.example.onemoretime.ninja.basic;

public class BasicPractice {
    public static void main(String[] args) {
        //# Basic Problems
        //1. factorial
        //2.sum
        //3.powerOf
        //4.print numbers in ascending and des
        //5.number of digits //R
        //6.fibo
        //7.checkPalindrome
        //8.countzeros //R
        //9.calculateexponentialsum
        //10.convertdecimaltobinary
        //11.geomatricsum
        //12.log2base
        //13.multiplicationofnumbers
        //14.reverse a string
        //15.sumofdigits
        //16.sumofevendigits
        //17.sumofseries in -- 3 op--3+2+1 =6

        // System.out.println(checkPalindrome(121));

        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 18, 45};
        int target = -4;
        int ans = binarySearchOrderRecursively(arr, target, 0, arr.length - 1);
        System.out.println(ans);


    }

    static int binarySearchOrderRecursively(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return binarySearchOrderRecursively(arr, target, start, mid - 1);
        } else {
            return binarySearchOrderRecursively(arr, target, mid + 1, end);
        }
    }


}
