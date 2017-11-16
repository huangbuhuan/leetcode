package main.java.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/15
 */
public class Solution599 {
    
    public String[] findRestaurant(String[] list1, String[] list2) {
        int max = Integer.MAX_VALUE;
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j]) && i + j <= max) {
                    set.add(list1[i]);
                    max = i + j;
                }
            }
        }
        String[] result = new String[set.size()];
        return set.toArray(result);
    }
    
}
