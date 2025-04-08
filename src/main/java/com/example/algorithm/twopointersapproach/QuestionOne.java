package com.example.algorithm.twopointersapproach;

import java.util.HashMap;
import java.util.Map;

public class QuestionOne {
    public static void main(String[] args) {
        /*given a sorted array find the number of pair which have sum equal to 11 in java int arr[]={1,4,4,5,5,5,6,6,11}
        use both two pointer approach and hashmap to solve this also show number of pairs*/
      /*  int[] arr = {1, 4, 4, 5, 5, 5, 6, 6, 11};
        int target = 11;

        System.out.println("Brute force Approach:");
        int brute = bruteForceSolution(arr, target);
        System.out.println("brute    " + brute);


        System.out.println("Two-Pointer Approach:");
        findPairsTwoPointer(arr, target);

        System.out.println("\nHashMap Approach:");
        findPairsUsingHashMap(arr, target);*/

        int[] arr = {1,4,4,5,5,5,6,6,11};
        int target = 10;
        System.out.println(PairCount(arr, target));
    }

    //brute force approach
    static int bruteForceSolution(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    static void findPairsTwoPointer(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                int leftCount = 1, rightCount = 1;

                while (left + 1 < right && arr[left] == arr[left + 1]) {
                    left++;
                    leftCount++;
                }
                while (right - 1 > left && arr[right] == arr[right - 1]) {
                    right--;
                    rightCount++;
                }

                count += leftCount * rightCount;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("Number of pairs: " + count);
    }

    static void findPairsUsingHashMap(int[] arr, int target) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;

            // Check if the complement is already in the map
            if (freqMap.containsKey(complement)) {
                // Add the count of complements already seen
                count += freqMap.get(complement);
            }

            // Update the frequency map with the current number
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Number of pairs: " + count);
    }


   /* Comparison: Which is Better?
    Criteria	Two-Pointer Approach	HashMap Approach
    Time Complexity	O(n)	O(n)
    Space Complexity	O(1)	O(n)
    When to Use	When the array is sorted and minimal memory usage is required.	When the array is unsorted or needs quick lookups.
*/


    public static int countleft(int[] a, int t, int l, int r) {
        int count = 0;
        while (l < r) {
            if (a[l] == t)
                count++;
            l++;
        }
        return count;
    }

    public static int countright(int[] a, int t, int l, int r) {
        int count = 0;
        while (l < r) {
            if (a[r] == t)
                count++;
            r--;
        }
        return count;
    }

    public static int lcr(int n, int r) {
        return fact(n) / fact(r) * fact(n - r);
    }

    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i < n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int PairCount(int[] arr, int t) {
        int l = 0;
        int r = arr.length - 1;
        int left, right;
        while (l < r) {
            if (arr[l] + arr[r] < t)
                l++;
            else if (arr[l] + arr[r] > t)
                r--;
            else {
                if (arr[l] != arr[r]) {
                    left = countleft(arr, arr[l], l, r);
                    right = countright(arr, arr[r], l, r);
                    return left * right;
                } else {
                    return lcr(arr[l], arr[r]);
                }
            }
        }
        return -1;
    }
}
