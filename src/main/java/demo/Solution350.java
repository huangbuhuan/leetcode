package main.java.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/20
 */
public class Solution350 {
    
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return null;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<>();
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        int[] nums = new int[result.size()];
        int index = 0;
        for (Integer i : result) {
            nums[index++] = i;
        }
        return nums;
    }
}
