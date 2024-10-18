package LeetCodeArrays;

public class SortByParity {
    public int[] sort(int[] nums){

        int writer = 0;
        for (int reader = 0; reader < nums.length; reader++) {
            if(nums[reader] % 2 != 0){
                continue;
            }else{
                int temp = nums[writer];
                nums[writer] = nums[reader];
                nums[reader] = temp;
                writer++;
            }
        }

        return nums;
    }
}
