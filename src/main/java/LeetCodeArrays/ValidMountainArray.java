package LeetCodeArrays;

public class ValidMountainArray {
    public boolean check(int[] arr){

        boolean upHillOccurred = false;
        boolean downHillOccurred = false;


        for (int idx = 1; idx < arr.length; idx++) {
            if(arr[idx - 1] < arr[idx]){
                if(downHillOccurred){
                    return false;
                }
                upHillOccurred = true;
            }
            if(arr[idx - 1] > arr[idx]){
                if(!upHillOccurred){
                    return false;
                }
                downHillOccurred = true;
            }

            if(arr[idx - 1] == arr[idx]){
                return false;
            }

        }
        return upHillOccurred && downHillOccurred;
    }
}
