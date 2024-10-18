package LeetCodeArrays;

public class FindThirdMax {
    public int find(int [] nums){
        int result = 0;

        if(nums == null || nums.length == 0){
            result = 0;
            return result;
        }
        if(nums.length == 1){
            result = nums[0];
            return result;
        }

        for (int idx = 0; idx < nums.length - 1; idx++) {
            for (int jdx = idx + 1; jdx < nums.length; jdx++) {
                if(nums[idx] < nums[jdx]){
                    int temp = nums[idx];
                    nums[idx] = nums[jdx];
                    nums[jdx] = temp;
                }
            }

        }

        int itemsCounted = 1;
        int prevItem = nums[0];
        for (int idx = 1; idx < nums.length ; idx++){

            if(nums[idx] != prevItem){
                itemsCounted++;
                prevItem = nums[idx];
            }

            if(itemsCounted == 3){
                result = nums[idx];
                return result;
            }
        }

        result = nums[0];

        return result;
    }
}
