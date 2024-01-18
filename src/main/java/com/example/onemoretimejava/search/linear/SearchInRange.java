package com.example.onemoretimejava.search.linear;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int index1 = 1;
        int index2 = 4;
        int target = 99;
        //search for 3 in the range of index[1,4]
        System.out.println(inRange(arr, index1, index2, target));
    }

    static boolean inRange(int[] arr, int index1, int index2, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = index1; i < index2; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
