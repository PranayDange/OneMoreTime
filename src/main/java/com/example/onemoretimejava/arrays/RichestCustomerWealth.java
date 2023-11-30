package com.example.onemoretimejava.arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
       /* Input: accounts = [[1,2,3],[3,2,1]]
        Output: 6*/
        int[][] arr = {
                {1, 2,14},
                {3, 2, 1}
        };
        maximumWealth(arr);
    }

    public static int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
        return ans;
    }
}
