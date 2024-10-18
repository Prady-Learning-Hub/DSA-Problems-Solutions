package LeetCodeArrays;

import java.util.ArrayList;

public class diffMaxEvenMinOdd {
    public int solve(ArrayList<Integer> A) {
        Integer result = 0;
        Integer min_odd = 2147483647;
        Integer max_even = -2147483648;

        for(int idx = 0; idx < A.size(); idx++){

            if(A.get(idx) % 2 == 0){
                if(A.get(idx) > max_even){
                    max_even = A.get(idx);
                }
            }

            if(A.get(idx) % 2 == 1){
                if(A.get(idx) < min_odd){
                    min_odd = A.get(idx);
                }
            }

        }

        result = max_even - min_odd;

        return result;
    }
}
