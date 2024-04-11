package com.example.onemoretimejava.maths;

public class NumberAppearsTwiceFIndSingledAppeared {
    public static void main(String[] args) {
        //you are given array of numbers in that array every number appears twice  and only one number appears once
        //you have to find that number

        int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        // System.out.println(evenOddWithBitwise(arr));
        System.out.println(findSingleElementG(arr));

    }


    //wrong way of thinking
   /* private static int evenOddWithBitwise(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    ans = num;
                    break;
                }
            }
        }
        return ans;
    }*/

    public static int findSingleElementG(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                return arr[i]; // Return the single element
            }
        }
        return -1; // If no single element found, return -1 or handle accordingly
        // In this array, the single element is 6, which appears only once. When we use count == 0,
        //it correctly identifies 6 as the single element because it doesn't have any duplicates.
    }

    //by using XOR
    //ANY number with same number is XOR then it gives zero
    public static int findSingleElementXor(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        return res;
    }


}
