package com.example.onemoretimejava.search.linear;

public class LinearSearch {
    public static void main(String[] args) {
        //best case time complexity O(1)
        //worst case time complexity O(N)
        int[] arr = {45, 34, 67, 4, 5, 3, 88, 22, 7, 11, 12, 15, 18};
        int target = 7;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    //search in the array : return the index if item found
    //otherwise return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                // index=i;
                return i;
            }
        }
        //System.out.println(index);
        return -1;
    }

}
