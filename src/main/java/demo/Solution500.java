package main.java.demo;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/4
 */
public class Solution500 {
    
    public String[] findWords(String[] words) {
        String one = "qwertyuiopQWERTYUIOP";
        String two = "asdfghjklASDFGHJKL";
        String three = "zxcvbnmZXCVBNM";
        String[] tmp = new String[words.length];
        int index = 0;
        for (String word : words) {
            int a = 0;
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                if (one.indexOf(word.charAt(i)) != -1 && (a == 0 || a == 1)) {
                    a = 1;
                } else if (two.indexOf(word.charAt(i)) != -1 && (a == 0 || a == 2)) {
                    a = 2;
                } else if (three.indexOf(word.charAt(i)) != -1 && (a == 0 || a == 3)) {
                    a = 3;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                tmp[index] = word;
                index ++;
            }
            flag = true;
            a = 0;
        }
        String[] result = new String[index];
        for (int i = 0; i < index; i ++) {
            result[i] = tmp[i];
        }
        return result;
    }
    
}
