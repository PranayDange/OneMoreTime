package com.example.onemoretimejava.search;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        peakIndexInMountainArrayO(arr);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int ans = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            /*for (int j = 1; j < n; j++) {
                if (arr[j - 1] > arr[j] && arr[j] > arr[j + 1]) {

                    ans = i;
                }
            }*/
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                ans = i;
            }
        }
        System.out.println(ans);
        return ans;
    }

    public static int peakIndexInMountainArray2(int[] arr) {
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if ((i == 0 || arr[i - 1] < arr[i]) && (i == n - 1 || arr[i] > arr[i + 1])) {
                ans = i;
            }
        }
        System.out.println(ans);
        return ans;
    }

    public static int peakIndexInMountainArrayO(int[] arr) {
        int ans = 0;
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                ans = mid;
            }

        }
        System.out.println(ans);
        return ans;
    }
}
