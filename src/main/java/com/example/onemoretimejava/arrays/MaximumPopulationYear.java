package com.example.onemoretimejava.arrays;

public class MaximumPopulationYear {
    public static void main(String[] args) {
       /* Input: logs = [[1993,1999],[2000,2010]]
        Output: 1993*/
        int[][] logs = {{1993, 1999}, {2000, 2010}};
        maximumPopulation(logs);
    }

    public static int maximumPopulation(int[][] logs) {
        int n = logs.length;
        int maxPopulation = 0;
        int earliestYear = Integer.MAX_VALUE;
        for (int year = 1950; year <= 2050; year++) {
            int population = 0;
            for (int j = 0; j < logs[year].length; j++) {
                if (logs[j][0] <= year && logs[j][1] > year) {
                    population++;
                }

            }
            if (population > maxPopulation) {
                maxPopulation = population;
                earliestYear = year;
            } else if (population == maxPopulation) {
                earliestYear = Math.min(earliestYear, year);

            }

        }
        System.out.println(earliestYear);
        return earliestYear;

    }

}
