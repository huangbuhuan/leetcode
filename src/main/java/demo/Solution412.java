package main.java.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/11/5
 */
public class Solution412 {
    
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        int i = 1;
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0){
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
            i++;
        }
        return result;
    }
    
}
