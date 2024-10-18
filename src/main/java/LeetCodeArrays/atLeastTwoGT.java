package LeetCodeArrays;

import java.util.*;

public class atLeastTwoGT {
    public List<Integer> solve(List<Integer> A){
        List<Integer> resultList = new ArrayList<>();

        //clone the List
        //sort the cloned List
        //arrange in a map, key = num, value = position from end
        //iterate and check each num in unsorted array, if it has a index GTE 2
        //if yes, add to the result list else move to the next number

        List<Integer> B = new ArrayList<>(A);
        Collections.sort(B);

        Map<Integer, Integer> num_positionFromEnd_Map = new HashMap<Integer,Integer>();
        for (int idx = 0; idx < B.size(); idx++) {
            int num_as_key = B.get(idx);
            int value_as_position_from_end = B.size() - (idx + 1);
            num_positionFromEnd_Map.put(num_as_key,value_as_position_from_end);
        }

        for (int idx = 0; idx < A.size(); idx++) {
            int num = A.get(idx);
            int position_from_end = num_positionFromEnd_Map.get(num);
            if(position_from_end >= 2){
                resultList.add(num);
            }
        }
        return resultList;
    }

    public List<Integer> solve_brute_force(List<Integer> inputList){
        List<Integer> resultList = new ArrayList<>();
        List<Integer> finalResultList = new ArrayList<>();

        //clone the List
        //sort the cloned List
        //iterate over the sorted list, arrange in a map, key = num, value = position & prepare the result list with index and empty values
        //In another loop, iterate and check each num in the sorted map if it has a index LTE (Size - 2)
        //if yes, add to the result list else move to the next number, while doing so check the Original index position of current number and accordingly update in the final result List for the right index to maintain the right Ordeing

        List<Integer> sortedList = new ArrayList<>(inputList);
        Collections.sort(sortedList);

        Map<Integer, Integer> num_position_Map = new HashMap<Integer,Integer>();
        for (int idx = 0; idx < sortedList.size(); idx++) {
            int num_as_key = sortedList.get(idx);
            int sorted_idx_as_position = idx ;
            num_position_Map.put(num_as_key,sorted_idx_as_position);

            resultList.add(idx,-9999999);
        }

        for (int idx = 0; idx < inputList.size(); idx++) {
            int position_idx_stored_in_sorted_map = num_position_Map.get(inputList.get(idx));
            if(position_idx_stored_in_sorted_map < (inputList.size() - 2)){
                resultList.add(idx,inputList.get(idx));
            }
        }

        for (int idx = 0; idx < resultList.size(); idx++) {
            if(resultList.get(idx) != -9999999){
                finalResultList.add(resultList.get(idx));
            }
        }

        return finalResultList;
    }

    public List<Integer> solve_pracice(List<Integer> inputList){
        List<Integer> resultList = new ArrayList<>();

        List<Integer> sortedList = new ArrayList<>(inputList);
        Collections.sort(sortedList);

        Map<Integer, Integer> sortedItemPositionMap = new HashMap<>();
        for(int idx=0;idx < sortedList.size();idx++){
            int sortedItem = sortedList.get(idx);
            int sortedItemPosition = idx;
            int sortedItemPositionFromEnd = sortedList.size() - (idx);
            sortedItemPositionMap.put(sortedItem,sortedItemPositionFromEnd);
        }

        for(int idx=0;idx < inputList.size();idx++){
            int inputItem = inputList.get(idx);
            int sortedItemPositionFromEnd = sortedItemPositionMap.get(inputItem);

            if(sortedItemPositionFromEnd > 2){
                resultList.add(inputItem);
            }
        }

        return resultList;
    }
}
