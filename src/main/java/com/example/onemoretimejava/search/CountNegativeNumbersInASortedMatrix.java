package com.example.onemoretimejava.search;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
        System.out.println(countNegativesBrute(mat));
    }

    public static int countNegativesBrute(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    ans++;
                }
            }

        }
        System.out.println(ans);
        return ans;
    }
}
