package com.example.onemoretimejava.search;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 773;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        int temp = num;
        int start=0;
        int end=num-1;
        int mid=(start +(end-start)/2);
        if(num==1){
            return true;
        }
        for (int i = 2; i <= mid ; i++) {
            if ((i * i) == temp) {
                return true;
            }
        }
        return false;
    }


    public boolean isPerfectSquare2(int num) {
        int temp = num;
        if(num==1){
            return true;
        }
        for (int i = 2; i <= num/2 ; i++) {
            if ((i * i) == temp) {
                return true;
            }
        }
        return false;
    }
    public boolean isPerfectSquare3(int num) {
        if (num == 1) {
            return true;
        }

        long start = 2;
        long end = num / 2;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
