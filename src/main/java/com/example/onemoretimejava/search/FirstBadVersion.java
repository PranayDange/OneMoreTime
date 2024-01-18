package com.example.onemoretimejava.search;

public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 5;
       // int ans = firstBadVersion(n);
       // System.out.println(ans);
    }

 /*   public static int firstBadVersion(int n) {

        int ans = 0;
        int previousEle = 0;
        for (int i = 1; i <= n; i++) {

           *//* boolean flag=isBadVersion(i);
            if(flag){
                if(previousEle<i){
                    ans=previousEle;
                }else {
                    ans=i;
                }
            }*//*
            ans = i;
            previousEle=i-1;
        }
        System.out.println("aaa" + ans);
        System.out.println("pppp" + previousEle);
        return ans;
    }*/

    /*public int firstBadVersion(int n) {
        int previousEle = 0;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            boolean flag = isBadVersion(i);
            if (flag) {
                if (previousEle == 0) {
                    return i;
                }
                if (previousEle < i) {
                    ans = previousEle;
                } else {
                    ans = i;
                }
            }
            previousEle++;
        }
        return ans;
    }*/
//found the first bad version why to continue
    /*public int firstBadVersion(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            boolean flag = isBadVersion(i);
            if (flag) {
                ans = i;
                break; // Found the first bad version, no need to continue the loop
            }
        }
        return ans;
    }*/
}
