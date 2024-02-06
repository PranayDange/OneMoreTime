package com.example.onemoretimejava.search;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = {1, 1};
        int[] bobSizes = {2, 2};
        fairCandySwap(aliceSizes, bobSizes);

    }

    public static void fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int totalAliceCandy = 0;
        int totalBobCandy = 0;
        int totalCandy = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            totalAliceCandy = totalAliceCandy + aliceSizes[i];
        }
        for (int j = 0; j < bobSizes.length; j++) {
            totalBobCandy = totalBobCandy + bobSizes[j];
        }
        System.out.println(totalAliceCandy);
        System.out.println(totalBobCandy);
        totalCandy = totalAliceCandy + totalBobCandy;
        int mid = totalCandy / 2;
        System.out.println(totalCandy);
    }

    public static int[] fairCandySwap3(int[] aliceSizes, int[] bobSizes) {
        int[] result = new int[2];

        int sumAlice = sumArray(aliceSizes);
        int sumBob = sumArray(bobSizes);

        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                int newSumAlice = sumAlice - aliceSizes[i] + bobSizes[j];
                int newSumBob = sumBob - bobSizes[j] + aliceSizes[i];

                if (newSumAlice == newSumBob) {
                    result[0] = aliceSizes[i];
                    result[1] = bobSizes[j];
                    return result;
                }
            }
        }

        return result;
    }

    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }


    public static int[] fairCandySwap2(int[] aliceSizes, int[] bobSizes) {
        int[] result = new int[2];

        int sumAlice = 0;
        for (int candy : aliceSizes) {
            sumAlice += candy;
        }

        int sumBob = 0;
        for (int candy : bobSizes) {
            sumBob += candy;
        }

        int target = (sumAlice + sumBob) / 2;

        for (int i = 0; i < aliceSizes.length; i++) {
            int complement = target - (sumAlice - aliceSizes[i]);

            for (int j = 0; j < bobSizes.length; j++) {
                if (bobSizes[j] == complement) {
                    result[0] = aliceSizes[i];
                    result[1] = bobSizes[j];
                    return result;
                }
            }
        }

        return result;
    }

}
