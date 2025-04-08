package com.example.onemoretimejava.ninja.hashmap;

import jnr.ffi.annotations.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 1, 5, 2, 3, 1, 5, 6};
        System.out.println(Arrays.toString(new ArrayList[]{removeDuplicates(arr)}));

    }

    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        HashMap<Integer, Boolean> seen = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (seen.containsKey(arr[i])) {
                continue;
            }
            arrList.add(arr[i]);
            seen.put(arr[i], true);
        }
        return arrList;
    }
}
