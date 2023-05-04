package com.example.onemoretime.arraysk.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //In BS you work with sorted array
        //what If?? you don't know that array is ascending/descending or not

        //how to find if array is sorted in which order ascending or descending??

        //if(s>e){
        // asending
        // }else{
        // desending
        // }
        // int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int[] arr = {48, 36, 20, 14, 12, 11, 9, 6, 4, 2};
        int target = 9;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {

            //find weather array is sorted in ascending or descending
            boolean isAsc = array[start] < array[end];
           /* if(array[start]<array[end]){
                isAsc=true;
            }else {
                isAsc=false;
            }*/


            //find the middle element
            //  int mid = (start + end) / 2;
            //  integer has a fixed size
            //might be possible that (start + end ) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < array[mid]) {
                    end = mid - 1;
                } else if (target > array[mid]) {
                    start = mid + 1;
                } else {
                    if (target > array[mid]) {
                        end = mid - 1;
                    } else if (target < array[mid]) {
                        start = mid + 1;
                    }
                }
            }


           /* if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }*/
        }
        return -1;

    }
}
