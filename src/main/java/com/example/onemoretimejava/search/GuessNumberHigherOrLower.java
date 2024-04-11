package com.example.onemoretimejava.search;

public class GuessNumberHigherOrLower {
    public static void main(String[] args) {

    }

    public int guessNumber(int n) {
        int pick = 10;

        for (int i = 1; i < n; i++) {
            int start = 1;
            int end = n;
            int mid = (start + (end - start) / 2);
            if (mid == pick) {
                return 0;
            } else if (mid < pick) {
                return 1;
            }
        }
        return -1;
    }

//code submitted on leetcode
  /*  public int guessNumber(int n) {
        int pick =10;

        for(int i=0;i<n;i++){
            if(guess(i)==0){
                return i;
            }
        }

        return n;
    }*/

   /* public int guessNumberOptimized(int n) {
        // int pick =10;
        int s = 1;
        int e = n - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (guess(m) == 0) {
                return m;
            } else if (guess(m) == -1) {
                e = m - 1;
            } else {
                s = m + 1;
            }

        }

        return n;
    }*/
}
