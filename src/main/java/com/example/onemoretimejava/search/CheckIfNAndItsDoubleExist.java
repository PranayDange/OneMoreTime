package com.example.onemoretimejava.search;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {7,1,14,11};
        checkIfExist(arr);
    }

    public static boolean checkIfExist(int[] arr) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    result = true;
                    break;
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
