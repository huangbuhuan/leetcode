package main.java.demo;


import java.util.Stack;

/**
 * @author hbh
 * @date 2019-04-27
 */
public class Solution1003 {

    public boolean isValid(String S) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == 'c') {
                if (stack.isEmpty()) {
                    return false;
                }

                if (stack.pop() != 'b') {
                    return false;
                }

                if (stack.isEmpty()) {
                    return false;
                }

                if (stack.pop() != 'a') {
                    return false;
                }

            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}
