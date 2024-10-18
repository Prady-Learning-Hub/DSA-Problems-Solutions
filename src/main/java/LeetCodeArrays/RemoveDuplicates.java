package LeetCodeArrays;

public class RemoveDuplicates {
    public int remove(int [] nums){
        //Set a writeIndex = 0;
        //Set a readIndex = writeIndex + 1;
        //In  a while loop check if item at writeIndex is equal to readIndex
        //if Yes, shift items in the array to left
        //else increment the value of writeIndex and readIndex
        //at the end k = writeIndex + 1;

        if(nums.length == 0){
            return 0;
        }

        int writeIndex = 0;
        int readIndex = writeIndex + 1;
        int k = 0;

        while(writeIndex < nums.length && readIndex < nums.length){
            if(nums[writeIndex] == nums[readIndex] && nums[writeIndex] != Integer.MIN_VALUE){
                for(int startIndex = writeIndex; startIndex < nums.length - 1; startIndex++){
                    nums[startIndex] = nums[startIndex + 1];
                    if((startIndex + 1) == (nums.length -1)){
                        nums[startIndex+1] = Integer.MIN_VALUE;
                    }
                }
                readIndex = readIndex - 1;
            }else{
                writeIndex = writeIndex + 1;
            }
            readIndex = readIndex + 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != Integer.MIN_VALUE){
                k = k + 1;
            }
        }
        return k;
    }

    public int removeOptimal(int [] nums){
        int writeIndex = 1;
        for (int readIndex = 1; readIndex < nums.length; readIndex++) {
            if(nums[readIndex - 1] != nums[readIndex]){
                nums[writeIndex] = nums[readIndex];
                writeIndex = writeIndex + 1;
            }
        }
        return writeIndex;

    }
}
