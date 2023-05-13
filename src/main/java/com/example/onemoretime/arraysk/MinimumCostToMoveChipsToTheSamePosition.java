package com.example.onemoretime.arraysk;

public class MinimumCostToMoveChipsToTheSamePosition {
    public static void main(String[] args) {
       /* Input: position = [1,2,3]
        Output: 1
        Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
        Second step: Move the chip at position 2 to position 1 with cost = 1.
        Total cost is 1.*/
        int[] arr={1,1000000000};
        minCostToMoveChips(arr);


    }
    static int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;

        // Count the number of chips at even and odd positions
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Return the minimum cost to move all chips to the same position
        System.out.println(Math.min(evenCount, oddCount));
        return Math.min(evenCount, oddCount);

    }
}
