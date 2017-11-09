package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/9
 */
public class Solution717 {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        for (; i < bits.length - 1;) {
            if (bits[i] == 1) {
                i += 2;
            } else {
                i += 1;
            }
        }
        return i == bits.length - 1;
    }
}
