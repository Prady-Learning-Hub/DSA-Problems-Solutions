package LeetCodeArrays;

import java.util.*;

public class FindDisAppearedNumbers {
    public List<Integer> find(int [] nums){
        List<Integer> result = new ArrayList<>();
        Map<Integer, Boolean> hashTable = new HashMap<>();

        for (int idx = 0; idx < nums.length; idx++) {
            hashTable.put(nums[idx],true);
        }

        for (int idx = 1; idx <= nums.length ; idx++) {
            if(!hashTable.containsKey(idx)){
                result.add(idx);
            }
        }

        return result;
    }
}
