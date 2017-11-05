package main.java.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 第575题，求姐姐最大能获得糖果的种类
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/5
 */
public class Solution575 {
    
    public int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        Set<Integer> categories = new HashSet<>();
        for (int i = 0; i < candies.length; i++) {
            categories.add(candies[i]);
        }
        int size = categories.size();
        int half = candies.length/2;
        return size > half ? half : size ;
    }
    
}
