package com.example.onemoretimejava.maths;

public class NumberAppearsTwiceFIndSingledAppeared2 {
    public static void main(String[] args) {
        //this question contain one -ve of that number and one +ve of number find Single element
        int[] arr = {-2, 3, 2, 4, -5, 5, -4};
        System.out.println(findSingleElementG(arr));
        System.out.println(findSingleElementG2(arr));
    }

    public static int findSingleElementG(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int num = arr[i];
            if (num < 0) {
                num *= -1;
            }
           // num *= -1;
            //or
            // int num = Math.abs(arr[i]);
            for (int j = 0; j < arr.length; j++) {
                if (i != j && num == arr[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                return arr[i];
            }

        }
        return -1;
    }

    public static int findSingleElementG2(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans + arr[i];
        }
        return ans;
    }
}
