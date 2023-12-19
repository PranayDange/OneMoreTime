package com.example.onemoretimejava.arrays;

public class MinimumCostToMoveChipsToTheSamePosition {
    public static void main(String[] args) {
        int[] position = {2, 2, 2, 3, 3};
        int result = minCostToMoveChips(position);
        System.out.println("Output: " + result);
    }

    public static int minCostToMoveChips(int[] position) {
        int minCost = Integer.MAX_VALUE;

        for (int i = 0; i < position.length; i++) {
            int targetPosition = position[i];
            int cost = 0;

            for (int j = 0; j < position.length; j++) {
                int chipPosition = position[j];
                int diff = Math.abs(targetPosition - chipPosition);
                cost += (diff % 2 == 0) ? 0 : 1; // cost is 0 for even, 1 for odd
            }

            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }
}


   /* public static int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

}*/
