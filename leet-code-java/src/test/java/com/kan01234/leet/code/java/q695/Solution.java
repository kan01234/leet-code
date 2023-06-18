package com.kan01234.leet.code.java.q695;

/*
 *  time complexity: O(m * n)
 *  space complexity to O(1)
 */
public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        // a simple dfs algo will do the work once we find a piece of land in the grid
        int m = grid.length, n = grid[0].length;

        int maxArea = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea, traverse(grid, i, j, m, n));
                }
            }
        }

        return maxArea;
    }

    private int traverse(int[][] grid, int i, int j, int m, int n){
        // base case
        if(!valid(grid, i, j, m, n)){
            return 0;
        }

        // setting the current index as 0, so that we don't visit it again
        grid[i][j] = 0;

        int ans = 1 + traverse(grid, i-1, j, m, n) + traverse(grid, i+1, j, m, n) + traverse(grid, i, j-1, m, n) + traverse(grid, i, j+1, m, n);
        return ans;
    }

    private boolean valid(int[][] grid, int i, int j, int m, int n) {
        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) {
            return false;
        }

        return true;
    }
}
