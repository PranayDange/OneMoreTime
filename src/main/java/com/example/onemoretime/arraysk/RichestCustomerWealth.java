package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class RichestCustomerWealth {
    // Input: accounts = [[1,2,3],[3,2,1]]
    // Output: 6
    // Input: accounts = [[1,5],[7,3],[3,5]]
    // Output: 10
    public static void main(String[] args) {
        //  int[] number = {{1,2,3},{3,2,1}};
        int[][] array = {{1, 2, 3}, {3, 2, 1,2}};

        maximumWealth(array);

    }

    public static int maximumWealth(int[][] accounts) {
        int maxi = Integer.MIN_VALUE;

        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum = sum + accounts[row][col];
            }
            maxi = Math.max(maxi, sum);

        }
        System.out.println(Arrays.toString(new int[]{maxi}));
        return maxi;


    }
}
