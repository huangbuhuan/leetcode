package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/5
 */
public class Solution566 {
    
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int column = nums[0].length;
        int count = row * column;
        if (count != r * c) {
            return nums;
        }
        int[] input = new int[count];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j ++) {
                input[index++] = nums[i][j];
            }
        }
        index = 0;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j ++) {
                result[i][j] = input[index++];
            }
        }
        
        return result;
    }
    
}
