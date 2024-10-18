package LeetCodeArrays;

import java.util.Arrays;
public class atleastOneLTandOneGT {
    public int solve(int [] A){
        int result = 0;

        Arrays.sort(A);
        int smallest = A[0];
        int greatest = A[A.length - 1];

        for (int num:A) {
            if(num > smallest && num < greatest){
                result = result + 1;
            }
        }

        return result;
    }
}
