package Scaler;

public class InsertionSort {
    public int[] sort(int nums[]){

        for(int idx = 1; idx < nums.length; idx++){
            for(int jdx = 0;jdx < idx ; jdx++){
                if(nums[jdx] > nums[idx]){
                    int temp = nums[idx];
                    nums[idx] = nums[jdx];
                    nums[jdx] = temp;
                }
            }
        }
        return nums;
    }
}
