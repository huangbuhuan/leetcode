package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/12
 */
public class Solution492 {
    
    public int[] constructRectangle(int area) {
        int l = (int) Math.sqrt(area);
        int w = l;
        while (l * w != area) {
            if (l * w > area) {
                w--;
            } else {
                l++;
            }
        }
        int[] result = new int[2];
        result[0] = l;
        result[1] = w;
        return result;
    }
    
}
