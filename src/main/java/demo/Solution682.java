package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/5
 */
public class Solution682 {
    
    public int calPoints(String[] ops) {
        for (int i = 0; i < ops.length; i++) {
            String a = ops[i];
            switch (a) {
                case "C":
                    ops[i] = "";
                    ops[findNotEmpty(ops, i- 1)] = "";
                    break;
                case "D":
                    ops[i] = Integer.valueOf(ops[findNotEmpty(ops, i- 1)])*2 + "";
                    break;
                case "+":
                    int firstIndex = findNotEmpty(ops, i - 1);
                    ops[i] = Integer.valueOf(ops[firstIndex]) + Integer.valueOf(ops[findNotEmpty(ops, firstIndex - 1)]) + "";
            }
        }
        int sum = 0;
        for (String str : ops) {
            if (!"".equals(str)) {
                System.out.println(str);
                sum += Integer.valueOf(str);
            }
        }
        return sum;
    }
    
    private int findNotEmpty(String[] strs, int index) {
        while ("".equals(strs[index])) {
            index--;
        }
        return index;
    }
    
    public static void main(String[] args) {
        System.out.println(new Solution682().calPoints(new String[]{"5","2","C","D","+"}));
    }
    
}
