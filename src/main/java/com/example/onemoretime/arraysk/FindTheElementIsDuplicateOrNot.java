package com.example.onemoretime.arraysk;

public class FindTheElementIsDuplicateOrNot {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 2, 1, 9,3, 6, 4, 6};
        //  printNonDuplicateNo(arr);

        System.out.printf(String.valueOf(anInt(arr)));
    }

    static int printNonDuplicateNo(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    ans = arr[i];
                }
            }
        }
       /* if (ans!=0) {
            System.out.printf("non duplicate element is " + ans);
        } else {
            System.out.printf("all duplicate elements are present");
        }*/
        System.out.printf(String.valueOf(ans));
        return ans;
    }

    static int anInt(int[] arr) {
        int unique = 0;
        for (int n :
                arr) {
            unique ^= n;
        }
        return unique;
    }
}
