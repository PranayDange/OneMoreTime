package com.example.onemoretimejava.recursion.array;

public class BinarySearchRecursion2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 2;
        System.out.println(search(arr, target, 0, arr.length - 1));

    }

    static int search(int[] arr, int target, int start, int end) {
        // int start = 0;
        //int end = arr.length - 1;

        // we are taking it in argument because
        //in next recursive call we need start and end

        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            //if target is actually less than middle
            //it basically means that my element lies in between left side
            return search(arr, target, start, mid - 1);
            //when ever you are calling a recursion call make sure you are returning it
            //if there is return type of a function

        } /*else {

        }*/
        return search(arr, target, mid + 1, end);
    }
}
