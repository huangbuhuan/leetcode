package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/30
 */
public class Solution238 {
    
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int countOfZero = 0;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                product *= nums[i];
            } else {
                countOfZero++;
                index = i;
            }
        }
        int[] result = new int[nums.length];
        if (countOfZero == 1){
            result[index] = product;
        } else if (countOfZero == 0) {
            for (int i = 0; i < result.length; i++) {
                if (nums[i] == 0) {
                    result[i] = product;
                } else {
                    result[i] = product / nums[i];
                }
            }
        }
        return result;
    }
    
}
