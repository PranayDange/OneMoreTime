package com.example.leetcode150.slidingwindow.fixedsize;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FirstNegativeEveryWindowOfSizeK {
    public static void main(String[] args) {
        // Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
        //Output: [-8, 0, -6, -6]
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;

        List<Integer> list = firstNegInt(arr, k);
        for (int pri : list) {
            System.out.print(pri + "," + " ");

        }

    }

    static List<Integer> firstNegInt(int arr[], int k) {
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        LinkedList<Integer> negatives = new LinkedList<>();
        int size = arr.length;
        while (j < size) {
            if (arr[j] < 0) {
                negatives.add(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (negatives.isEmpty()) {
                    list.add(0);
                } else {
                    list.add(negatives.peek());
                    if (arr[i] == negatives.peek()) {
                        negatives.poll();

                    }
                }
                i++;
                j++;
            }
        }
        return list;

    }
}
