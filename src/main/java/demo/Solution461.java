package main.java.demo;

/**
 * 第461题 计算两个数对应比特不同的位置数
 * ===> 1 4(0001 01000)
 * <=== 2
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/3
 */
public class Solution461 {
    
    public int hammingDistance(int x, int y) {
        if (x == y) {
            return 0;
        }
        int z = x ^ y;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((z & 1) != 0) {
                result++;
            }
            z >>= 1;
        }
        return result;
    }
    
}
