package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/5
 */
public class Solution463 {
    
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int result = 0;
        int tmp = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    if (i - 1 >= 0 ) {
                         if (grid[i - 1][j] == 1) {
                             tmp ++;
                         }
                    }
                    if (j - 1 >= 0 ) {
                        if (grid[i][j - 1] == 1) {
                            tmp++;
                        }
                    }
                    result++;
                }
            }
        }
        return result*4 - tmp*2;
    }
    
}
