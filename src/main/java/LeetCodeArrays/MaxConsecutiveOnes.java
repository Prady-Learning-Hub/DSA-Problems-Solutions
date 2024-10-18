package LeetCodeArrays;

public class MaxConsecutiveOnes {
    public int findBruteForce1(int [] nums){
        int maxCount = 0;

        int noOfZeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                noOfZeroes++;
            }
        }

        if(noOfZeroes == 0){
           maxCount = nums.length;
           return maxCount;
        }

        //collect the indexes of zeroes
        int [] zeroes = new int[noOfZeroes];
        int zeroesCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                zeroes[zeroesCounter] = i;
                zeroesCounter++;
            }
        }

        for (int i = 0; i < zeroes.length; i++) {
            nums[zeroes[i]] = 1;

            int currOnesCount = 0;
            for (int j = 0; j < nums.length - 1; j++) {
                if(nums[j] == 1 && nums[j+1] == 1){
                    currOnesCount++;
                }else{
                    if(currOnesCount > maxCount){
                        maxCount = currOnesCount;
                    }
                    currOnesCount = 0;
                }
            }
            if(currOnesCount > maxCount){
                maxCount = currOnesCount;
            }
            currOnesCount = 0;

            nums[zeroes[i]] = 0;
        }

        return maxCount+1;
    }

    public int findBruteForce2(int [] nums){
        int longestSequence = 0;

        for(int leftIndex = 0; leftIndex < nums.length; leftIndex++){
            int noOfZeroes = 0;
            for (int rightIndex = leftIndex; rightIndex < nums.length; rightIndex++) {
                if(nums[rightIndex] == 0){
                    noOfZeroes++;
                }
                if(noOfZeroes <=1){
                    longestSequence = Math.max(longestSequence,rightIndex-leftIndex+1);
                }
            }
        }
        return longestSequence;
    }

    public int findUsingSlidingWindow(int [] nums){
        int longestSequence = 0;

        int leftIndex = 0;
        int rightIndex = 0;
        int noOfZeroes = 0;

        while(rightIndex < nums.length){

            if(nums[rightIndex] == 0){
                noOfZeroes++;
            }

            while(noOfZeroes == 2){
                if(nums[leftIndex] == 0){
                    noOfZeroes--;
                }
                leftIndex++;
            }
            longestSequence = Math.max(longestSequence,rightIndex - leftIndex + 1);

            rightIndex++;
        }

        return longestSequence;
    }
}
