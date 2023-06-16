package com.kan01234.leet.code.java.q1615;

public class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] cityRank = new int[n];
        boolean[] connected = new boolean[n * n];

        for (int[] road : roads) {
            int city1 = road[0];
            int city2 = road[1];
            cityRank[city1]++;
            cityRank[city2]++;
            connected[city1 * n + city2] = true;
            connected[city2 * n + city1] = true;
        }

        int maxRank = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int rank = cityRank[i] + cityRank[j];
                if (connected[i * n + j]) {
                    rank--;
                }
                maxRank = Math.max(maxRank, rank);
            }
        }

        return maxRank;
    }
}
