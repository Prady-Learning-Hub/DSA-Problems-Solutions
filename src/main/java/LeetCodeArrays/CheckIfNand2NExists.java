package LeetCodeArrays;

public class CheckIfNand2NExists {
    public boolean check(int [] arr){
        if(arr == null){
            return false;
        }

        if(arr.length == 1){
            return false;
        }

        boolean result = false;

        for (int idx = 0; idx < arr.length; idx++) {
            for (int jdx = 0; jdx < arr.length; jdx++) {
                if(arr[idx] == 2 * arr[jdx] && idx != jdx){
                    result = true;
                    return result;
                }
            }
        }
        return result;
    }
}
