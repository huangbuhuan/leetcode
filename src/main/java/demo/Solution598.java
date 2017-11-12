package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/12
 */
public class Solution598 {
    
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m * n;
        }
        int minI = 400000;
        int minJ = 400000;
        for (int[] a: ops) {
            minI = Math.min(a[0], minI);
            minJ = Math.min(a[1], minJ);
        }
        return minI*minJ;
    }
    
}
