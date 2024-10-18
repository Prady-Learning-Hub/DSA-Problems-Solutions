package LeetCodeArrays;

public class RepeatedDeletion {
    public int[] removeDuplicates(int []nums){
        //given that the array is sorted
        if(nums == null || nums.length == 0){
            return nums;
        }

        int uniqueItems = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            if(idx == 0 || nums[idx] != nums[idx - 1]){
                uniqueItems = uniqueItems + 1;
            }
        }
        System.out.println("Numbre of unique items in the array : " + uniqueItems);

        int [] results = new int[uniqueItems];
        int jdx = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            if(idx == 0 || nums[idx] != nums[idx - 1]){
                results[jdx] = nums[idx];
                jdx = jdx + 1;
            }
        }
        return results;
    }
}
