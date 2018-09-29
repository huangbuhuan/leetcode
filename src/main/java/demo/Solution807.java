package main.java.demo;

/**
 * 807题
 *
 * @author hbh
 */
public class Solution807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] left = new int[grid.length];
        int[] top = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > left[i]) {
                    left[i] = grid[i][j];
                }
                if (grid[j][i] > top[i]) {
                    top[i] = grid[j][i];
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (left[i] > top[j]) {
                    if (grid[i][j] < top[j]) {
                        sum += (top[j] - grid[i][j]);
                    }
                } else {
                    if (grid[i][j] < left[i]) {
                        sum += (left[i] - grid[i][j]);
                    }
                }

            }
        }
        return sum;
    }
}
