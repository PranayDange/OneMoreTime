package com.example.onemoretimejava.recursion.maze;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}


        };
        // pathRestriction("", board, 0, 0);
        int[][] path = new int[board.length][board[0].length];
        pathRestrictionPrint("", board, 0, 0, path, 1);

    }

    static void pathRestriction(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        //considering this block in the path
        maze[r][c] = false;
        if (r < maze.length - 1) {
            pathRestriction(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathRestriction(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            pathRestriction(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            pathRestriction(p + 'L', maze, r, c - 1);
        }
        //this line is where the function will be over
        //so before the function gets removed also remove the changes that were made by that function
        maze[r][c] = true;
        //make a change and then reverse tha change when that work is done
    }

    static void pathRestrictionPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            // System.out.println(p);
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();

            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            pathRestrictionPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            pathRestrictionPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            pathRestrictionPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            pathRestrictionPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
