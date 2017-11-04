package main.java.demo;

/**
 * 第476题
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/4
 */
public class Solution476 {
    
    public int findComplement(int num) {
        return ~num & Integer.highestOneBit(num) - 1;
    }
    
}
