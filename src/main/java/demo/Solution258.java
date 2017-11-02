package main.java.demo;
/**
 * 258.给定一个非负整数num，反复添加的所有数字直到结果只有一个数字。
 * 例如:num= 38，过程是这样的：3 + 8 = 11，1 + 1 = 2。由于2只有一个数字，返回它。
 *
 * @author hbh
 *
 */
public class Solution258 {
	public int addDigits(int num) {
		return num == 0 ? 0 : num%9 == 0 ? 9 : num%9;
    }
}
