package main.java.demo;

/**
 * 第657题
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/3
 */
public class Solution657 {
    
    public boolean judgeCircle(String moves) {
        if (moves == null || moves.length() == 0) {
            return true;
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                default:
                    return false;
            }
        }
        return x == 0 && y == 0;
    }
}
