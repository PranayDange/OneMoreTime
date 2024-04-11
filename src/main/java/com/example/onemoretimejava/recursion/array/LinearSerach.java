package com.example.onemoretimejava.recursion.array;

import jnr.ffi.annotations.In;

import java.util.ArrayList;

public class LinearSerach {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 4, 18, 9};
        int[] arr2 = {3, 2, 1, 1, 18, 9};
        int target = 1;
        int index = 0;
        int indexLast = arr.length - 1;
        System.out.println(ls(arr, target, index));
        System.out.println(lsIndex(arr, target, index));
        System.out.println(findIndexFromLAst(arr, target, indexLast));

        findAllIndexFromLAst(arr2, target, index);
        System.out.println(list);
        System.out.println(findAllIndexFromLAstWithParameter(arr, 4, 0, new ArrayList<>()));
        //or
        // ArrayList<Integer> ans=findAllIndexFromLAstWithParameter(arr, 4, 0, new ArrayList<>());
        //System.out.println(ans);
    }

    static boolean ls(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;

        }
        return arr[index] == target || ls(arr, target, index + 1);
    }

    static int lsIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return lsIndex(arr, target, index + 1);
        }
        //or
        // return lsIndex(arr, target, index + 1);
    }

    static int findIndexFromLAst(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexFromLAst(arr, target, index - 1);
        }
        //or
        // return lsIndex(arr, target, index + 1);
    }

    //find all index
    static ArrayList<Integer> list = new ArrayList<>();

    //this is not static so function is not static...if we make function non static then we cannot use this list
    //both have to either static or nonstatic
    static void findAllIndexFromLAst(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndexFromLAst(arr, target, index + 1);
    }

    //if you do not want to do this outside  static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> findAllIndexFromLAstWithParameter(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndexFromLAstWithParameter(arr, target, index + 1, list);
    }

    //return the list //but don't take it in argument
    //return type will be arraylist
    //problem is that every call will have new list
    //so we need some sort of way to pass the data above
    static ArrayList<Integer> findAllIndexFromLAstWithOutParameter(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        //this will contain ans for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndexFromLAstWithOutParameter(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
