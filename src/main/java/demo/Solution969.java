package main.java.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hbh
 * @date 2019-08-04
 */
public class Solution969 {

    public List<Integer> pancakeSort(int[] A) {
        int maxIndex = A.length;
        List<Integer> result = new ArrayList<>();
        while (maxIndex > 1) {

            int max = 0;
            int index = 0;
            for (int i = 0; i < maxIndex; i++) {
                if(A[i] > max){
                    max = A[i];
                    index = i;
                }
            }

            reverse(A, index + 1);
            result.add(index + 1);
            reverse(A, maxIndex);
            result.add(maxIndex);

            maxIndex--;
        }

        return result;
    }

    private void reverse(int[] A, int length) {
        if (length < 2) {
            return;
        }

        int mid = length / 2;
        length--;

        for (int i = 0; i < mid; i++) {
            A[i] ^= A[length - i];
            A[length - i] ^= A[i];
            A[i] ^= A[length - i];
        }
    }
}
