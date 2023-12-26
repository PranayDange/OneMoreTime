package com.example.onemoretimejava.arrays;

public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        // Input: m = 2, n = 3, indices = [[0,1],[1,1]]
        int m = 2;
        int n = 3;
        int[][] indices = {{0, 1}, {1, 1}};
        oddCells(m, n, indices);

    }

    static int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];

        for (int i = 0; i < indices.length; i++) {

            //row is constant
            for (int j = 0; j < n; j++) {
                ans[indices[i][0]][j]++;
            }

            //column is constant
            for (int j = 0; j < m; j++) {
                ans[j][indices[i][1]]++;
            }

        }
       /* for (int i = 0; i < indices.length; i++) {
            int rowIndex = indices[i][0];
            int colIndex = indices[i][1];

            // Increment all cells in the corresponding row
            for (int j = 0; j < n; j++) {
                matrix[rowIndex][j]++;
            }

            // Increment all cells in the corresponding column
            for (int k = 0; k < m; k++) {
                matrix[k][colIndex]++;
            }
        }*/
        // Counting ODD numbers in the final Matrix
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }



   /* public class OddValuedCells {
        public static void main(String[] args) {
            int m1 = 2, n1 = 3;
            int[][] indices1 = {{0, 1}, {1, 1}};
            System.out.println(oddCells(m1, n1, indices1)); // Output: 6

            int m2 = 2, n2 = 2;
            int[][] indices2 = {{1, 1}, {0, 0}};
            System.out.println(oddCells(m2, n2, indices2)); // Output: 0
        }*/

      /*  public static int oddCells(int m, int n, int[][] indices) {
            int[][] matrix = new int[m][n];

            for (int i = 0; i < indices.length; i++) {
                int[] index = indices[i];

                // Increment all cells in the corresponding row
                for (int j = 0; j < n; j++) {
                    matrix[index[0]][j]++;
                }

                // Increment all cells in the corresponding column
                for (int k = 0; k < m; k++) {
                    matrix[k][index[1]]++;
                }
            }

            return countOddCells(matrix);
        }

        private static int countOddCells(int[][] matrix) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] % 2 != 0) {
                        count++;
                    }
                }
            }
            return count;
        }*/
    }


/*
public class OddValuedCells {
    public static void main(String[] args) {
        int m1 = 2, n1 = 3;
        int[][] indices1 = {{0, 1}, {1, 1}};
        System.out.println(oddCells(m1, n1, indices1)); // Output: 6

        int m2 = 2, n2 = 2;
        int[][] indices2 = {{1, 1}, {0, 0}};
        System.out.println(oddCells(m2, n2, indices2)); // Output: 0
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[] rowIncrements = new int[m];
        int[] colIncrements = new int[n];

        for (int[] index : indices) {
            rowIncrements[index[0]]++;
            colIncrements[index[1]]++;
        }

        return countOddCells(rowIncrements, colIncrements);
    }

    private static int countOddCells(int[] rowIncrements, int[] colIncrements) {
        int oddCount = 0;

        for (int row : rowIncrements) {
            for (int col : colIncrements) {
                if ((row + col) % 2 != 0) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }
}
*/



