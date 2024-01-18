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
}
