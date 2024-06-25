package com.example.onemoretimejava.sorting;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int i = majorityElement(nums);
        int i1 = majorityElementUsingHashing(nums);
        System.out.println(i1);
        System.out.println(i);
    }

    public static int majorityElement(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > (n / 2)) {
                return nums[i];
            }
        }

        return -1;
        //here complexity is 0(n.sq)
    }

    //if there is a count and we have to keep a track of how many times it occurs we have to use hashing
    public static int majorityElementUsingHashing(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int maxCount = nums.length / 2;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > maxCount) {
                return nums[i];
            }
        }
        return -1;
    }

    public static int majorityElementUsingMooreVoting(int[] arr) {
        //size of the given array
        int n = arr.length;
        int count = 0;
        int element = 0;

        for(int i=0;i<n;i++){

        }

        return -1;
    }


        public static int majorityElementUsingMoore(int []v) {
        //size of the given array:
        int n = v.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }



}

