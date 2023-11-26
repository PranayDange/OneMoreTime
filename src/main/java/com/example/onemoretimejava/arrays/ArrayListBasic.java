package com.example.onemoretimejava.arrays;


import jnr.ffi.annotations.In;

import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
       // ArrayList<Integer> arr1 = new ArrayList<>(10);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(arr);

        ArrayList<ArrayList<Integer>> arr2=new ArrayList<>();
    }
}
