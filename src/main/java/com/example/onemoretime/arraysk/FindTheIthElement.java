package com.example.onemoretime.arraysk;

public class FindTheIthElement {
    public static void main(String[] args) {
        int[] array = {4, 3, 6, 7, 9, 7, 59};
        int target = 59;
        printIthTerm(array, target);
    }

    static int printIthTerm(int[] arr, int num) {
        int ans = 0;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                ans = arr[i];
                System.out.println(ans);
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("element not in array");
        }
        //System.out.println(ans);
        return ans;
    }
}
