package main.java.demo;


/**
 * 371.计算两个整数和B的和，但你不允许使用运算符+和—。
 * @author hbh
 *
 */
public class Solution371 {
	public int getSum(int a, int b) {
		int sum = 0;
		do{
			sum = a^b;//不带进位的加
			b = (a&b) << 1;//相加时哪里有进位 并向左移1位
			a = sum;
		}while(b != 0);
		return a;
	}

}
