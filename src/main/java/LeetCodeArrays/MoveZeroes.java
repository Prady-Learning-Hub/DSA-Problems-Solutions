package LeetCodeArrays;

public class MoveZeroes {
    public int[] move(int[] nums){


        int writer = 0;

        for (int reader = 0; reader < nums.length; reader++) {
            if(nums[reader] == 0){
                continue;
            }else{
                nums[writer] = nums[reader];
                writer = writer + 1;
            }
        }

        while (writer < nums.length){
            nums[writer] = 0;
            writer = writer + 1;
        }


        return nums;
    }
}
