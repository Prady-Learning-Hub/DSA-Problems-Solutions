package Scaler;

public class MergeSortedArrays {
    public void merge(){

       int []lNums = new int[]{10,15};
       int []rNums = new int[]{1,10,23};

       /* int []lNums = new int[]{1,2};
        int []rNums = new int[]{4,11,17};*/
        int []mergedNums = new int[lNums.length + rNums.length];

        int sizeLNums = lNums.length;
        int sizeRNums = rNums.length;

        int idxLNums = 0;
        int idxRNums = 0;
        int idxMNums = 0;

        while(idxLNums < sizeLNums && idxRNums < sizeRNums){

            if(lNums[idxLNums] <= rNums[idxRNums]){
                mergedNums[idxMNums] = lNums[idxLNums];
                idxLNums++;
            }else{
                mergedNums[idxMNums] = rNums[idxRNums];
                idxRNums++;
            }
            idxMNums++;
        }

        while(idxLNums < sizeLNums){
            mergedNums[idxMNums] = lNums[idxLNums];
            idxLNums++;
            idxMNums++;
        }

        while(idxRNums < sizeRNums){
            mergedNums[idxMNums] = rNums[idxRNums];
            idxRNums++;
            idxMNums++;
        }

        for (int num:mergedNums){
            System.out.println(num);
        }

    }

    public void mergeUsingFor(){

        int []lNums = new int[]{10,15};
        int []rNums = new int[]{1,10,23};

       /* int []lNums = new int[]{1,2};
        int []rNums = new int[]{4,11,17};*/
        int []mergedNums = new int[lNums.length + rNums.length];

        int sizeLNums = lNums.length;
        int sizeRNums = rNums.length;
        int sizeMNums = mergedNums.length;

        int idxLNums = 0;
        int idxRNums = 0;
        int idxMNums = 0;

        for (int idxW = 0; idxW < sizeMNums; idxW++) {
            if(idxLNums < sizeLNums && idxRNums < sizeRNums){
                if(lNums[idxLNums] <= rNums[idxRNums]){
                    mergedNums[idxMNums] = lNums[idxLNums];
                    idxLNums++;
                }else{
                    mergedNums[idxMNums] = rNums[idxRNums];
                    idxRNums++;
                }
                idxMNums++;
            } else if(idxLNums < sizeLNums){
                mergedNums[idxMNums] = lNums[idxLNums];
                idxLNums++;
                idxMNums++;
            }else{
                mergedNums[idxMNums] = rNums[idxRNums];
                idxRNums++;
                idxMNums++;
            }
        }

        for (int num:mergedNums){
            System.out.println(num);
        }

    }

    public void mergeViaMax(){

        int []lNums = new int[]{10,15};
        int []rNums = new int[]{1,10,23};

       /* int []lNums = new int[]{1,2};
        int []rNums = new int[]{4,11,17};*/
        int []mergedNums = new int[lNums.length + rNums.length];

        int sizeLNums = lNums.length;
        int sizeRNums = rNums.length;
        int sizeMNums = mergedNums.length;

        int idxLNums = sizeLNums - 1;
        int idxRNums = sizeRNums - 1;
        int idxMNums = sizeMNums - 1;

        while(idxLNums >= 0 && idxRNums >= 0){

            if(rNums[idxRNums] >= lNums[idxLNums] ){
                mergedNums[idxMNums] = rNums[idxRNums];
                idxRNums--;
            }else{
                mergedNums[idxMNums] = lNums[idxLNums];
                idxLNums--;
            }
            idxMNums--;
        }

        while(idxRNums >= 0){
            mergedNums[idxMNums] = rNums[idxRNums];
            idxRNums--;
            idxMNums--;
        }

        while(idxLNums >= 0){
            mergedNums[idxMNums] = lNums[idxLNums];
            idxLNums--;
            idxMNums--;
        }



        for (int num:mergedNums){
            System.out.println(num);
        }

    }

    public void mergeInPlace(){

        int []lNums = new int[]{1,3,7,0,0,0,0};
        int []rNums = new int[]{2,5,9};

       /* int []lNums = new int[]{1,2,0,0};
        int []rNums = new int[]{4,17};*/
        //int []mergedNums = new int[lNums.length + rNums.length];

        int capcityLNums = lNums.length;
        int sizeLNums = 0;
        int sizeRNums = rNums.length;

        int idxLNums = 0;
        int idxRNums = 0;
        int idxMNums = 0;

        while(idxMNums < capcityLNums && idxRNums < sizeRNums){
            if( lNums[idxLNums] < rNums[idxRNums] && idxLNums <= sizeLNums){
                idxLNums++;
            }else{
                //shift the values to the right and then insert the number to the next position
                for (int idx = capcityLNums -1 ; idx >= idxMNums; idx--) {
                    lNums[idx] = lNums[idx -1];
                }

                lNums[idxMNums] = rNums[idxRNums];
                idxRNums++;
            }
            idxMNums++;
        }

        //idxMNums = idxMNums - 1;
        while(idxRNums < sizeRNums){
            lNums[idxMNums] = rNums[idxRNums];
            idxRNums++;
            idxMNums++;
        }

        for (int num:lNums){
            System.out.println(num);
        }
    }
}
