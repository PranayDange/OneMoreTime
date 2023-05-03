package com.example.onemoretime.arraysk.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50, 86, 47, 44};
        int start = 1;
        int end = 5;
        int target = 44;
        System.out.println(searchInRange(arr, target, start, end));
    }

    //this method will give index number of that found element
    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
