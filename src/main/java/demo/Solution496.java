package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/5
 */
public class Solution496 {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                   index = j;
                   break;
                }
            }
            for (; index < nums2.length; index++) {
                if (nums1[i] < nums2[index]) {
                    flag = true;
                    result[i] = nums2[index];
                    break;
                }
            }
            if (!flag) {
                result[i] = -1;
            }
            flag = false;
            index = 0;
        }
        return result;
    }
    
}
