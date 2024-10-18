package LeetCodeArrays;

public class HeightChecker {
    public int check(int[] heights){

        int[] expected = new int[heights.length];
        //copy the array
        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }

        //sort the array first
        for (int idx = 0; idx < expected.length; idx++) {
            for (int jdx = idx + 1; jdx < expected.length; jdx++) {
                if(expected[jdx] < expected[idx]){
                    int temp = expected[idx];
                    expected[idx] = expected[jdx];
                    expected[jdx] = temp;
                }
            }
        }

        int doNotMatchLen = 0;

        for (int i = 0; i < expected.length; i++) {
            if(heights[i] != expected[i]){
                doNotMatchLen++;
            }
        }

        return doNotMatchLen;
    }
}
