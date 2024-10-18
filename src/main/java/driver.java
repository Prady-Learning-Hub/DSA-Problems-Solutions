import LeetCodeArrays.FindDisAppearedNumbers;
import LeetCodeLinkedList.MyLinkedList;

import java.util.List;
//import LeetCodeArrays;

public class driver {
    public static void main(String[] args) {

        MyLinkedList obj = new MyLinkedList();
         //obj.addAtHead(1);//
         //obj.addAtTail(3);//
         obj.addAtIndex(0,10);//10
         int result1 = obj.get(0);//10
        System.out.println(result1);
        obj.addAtIndex(0,20);//20->10
        int result2 = obj.get(0);//20
         System.out.println(result2);
        obj.addAtIndex(1,30);//20->30->10
         int result3 = obj.get(1);//30
        System.out.println(result3);//30
        int result4 = obj.get(0);//20
        System.out.println(result4);


      /*  ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(0);A.add(2);A.add(9);
        LeetCodeArrays.diffMaxEvenMinOdd objdMEMO = new LeetCodeArrays.diffMaxEvenMinOdd();
        Integer result = objdMEMO.solve(A);
        System.out.println(result);*/


       /* ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(11);A.add(17);A.add(100);A.add(5);
        LeetCodeArrays.atLeastTwoGT objaLT = new LeetCodeArrays.atLeastTwoGT();
        List<Integer> result = objaLT.solve_brute_force(A);

        for (int num:result){
            System.out.println(num);
        }*/

       /* Scaler.InsertionSort objInsSort = new Scaler.InsertionSort();
        int nums[] = new int[]{5,-4,-3,200,100};
        int result[] = objInsSort.sort(nums);
        for (int num:result){
            System.out.println(num);
        }*/

       /* Scaler.MergeSortedArrays objMergeSortedArrays = new Scaler.MergeSortedArrays();
        objMergeSortedArrays.mergeUsingFor();*/

        /*LeetCodeArrays.RemoveElement obj = new LeetCodeArrays.RemoveElement();
        int [] nums = new int[]{1};
        int idxLast = obj.remove(nums,1);
        System.out.println("k = " + idxLast);
        System.out.println("Printing the newArray");
        for (int num:nums){
            System.out.println(num);
        }*/

        /*LeetCodeArrays.RemoveDuplicates obj = new LeetCodeArrays.RemoveDuplicates();
        //int [] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        //int [] nums = new int[]{1,1,1};
        //int [] nums = new int[]{0,0,0};
        //int [] nums = new int[]{1,2,3};
        //int [] nums = new int[]{};
        //int [] nums = new int[]{1};

        //int k = obj.remove(nums);
        int k = obj.removeOptimal(nums);

        System.out.println("k = " + k);
        System.out.println("Printing the newArray");
        for (int num:nums){
            System.out.println(num);
        }*/

        /*LeetCodeArrays.CheckIfNand2NExists obj = new LeetCodeArrays.CheckIfNand2NExists();
        int [] nums = new int[]{7,15,3,4,30};
        boolean res  = obj.check(nums);
        System.out.println(res);*/

       /* LeetCodeArrays.ValidMountainArray obj = new LeetCodeArrays.ValidMountainArray();
        //int [] nums = new int[]{0,2,3,4,5,2,1,0};
        int [] nums = new int[]{0,2,3,3,5,2,1,0};
        boolean result = obj.check(nums);
        System.out.println(result);*/

        /*LeetCodeArrays.RepeatedDeletion obj = new LeetCodeArrays.RepeatedDeletion();
        int [] nums = new int[]{0,1,1,1,2,2,5};
        int [] result = obj.removeDuplicates(nums);
        for (int num:result){
            System.out.println(num);
        }*/

        /*LeetCodeArrays.MoveZeroes obj = new LeetCodeArrays.MoveZeroes();
        int[] nums = new int[]{0,0,1};
        int [] result = obj.move(nums);
        for (int num:nums){
            System.out.println(num);
        }*/

      /*  LeetCodeArrays.SortByParity obj = new LeetCodeArrays.SortByParity();
        int[] nums = new int[]{3,1,2,4};
        int[] result = obj.sort(nums);
        for (int num:result){
            System.out.println(num);
        }*/

       /* LeetCodeArrays.HeightChecker obj = new LeetCodeArrays.HeightChecker();
        int []heights = new int[]{5,1,2,3,4};
        int result = obj.check(heights);

            System.out.println(result);*/

        /*
        LeetCodeArrays.MaxConsecutiveOnes obj = new LeetCodeArrays.MaxConsecutiveOnes();
        int [] nums = new int[]{1,0,1,1,0,1};
        int maxOnes = obj.findUsingSlidingWindow(nums);
        System.out.println(maxOnes);*/

        /*LeetCodeArrays.FindThirdMax obj = new LeetCodeArrays.FindThirdMax();
        //int []nums = new int[]{1};
        //int [] nums = new int[]{3,2};
        int []nums = new int[]{3,2,1};
        int result = obj.find(nums);
        System.out.println(result);
        System.out.println("------------------------");
        for (int num:nums){
            System.out.println(num);
        }*/

        /*FindDisAppearedNumbers obj = new FindDisAppearedNumbers();
        int [] nums = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> result = obj.find(nums);
        System.out.println("------------------------");
        for (int num:result){
            if(num != 0)
            System.out.println(num);
        }*/

        /*ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(11);A.add(17);A.add(100);A.add(5);
        LeetCodeArrays.atLeastTwoGT objaLT = new LeetCodeArrays.atLeastTwoGT();
        List<Integer> result = objaLT.solve_pracice(A);
        for (int num:result){
            System.out.println(num);
        }*/

        /*
        LeetCodeArrays.atleastOneLTandOneGT objLTGT = new LeetCodeArrays.atleastOneLTandOneGT();
        int [] A = new int[]{4,3,1,2,1,2};
        int count = objLTGT.solve(A);
        System.out.println(count);
        */
        /*
        Scaler.primeNumber objPN = new Scaler.primeNumber();
        boolean isPrimeTest = objPN.isPrimeBruteForce(1);
        System.out.println("isPrimeBruteForce(1) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeBruteForce(2);
        System.out.println("isPrimeBruteForce(2) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeBruteForce(3);
        System.out.println("isPrimeBruteForce(3) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeBruteForce(4);
        System.out.println("isPrimeBruteForce(4) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeBruteForce(11);
        System.out.println("isPrimeBruteForce(11) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeBruteForce(23);
        System.out.println("isPrimeBruteForce(23) - " + isPrimeTest);

        System.out.println("-----------------------------------------");

        isPrimeTest = objPN.isPrimeOptimize_1(1);
        System.out.println("isPrimeOptimize_1(1) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeOptimize_1(2);
        System.out.println("isPrimeOptimize_1(2) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeOptimize_1(3);
        System.out.println("isPrimeOptimize_1(3) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeOptimize_1(4);
        System.out.println("isPrimeOptimize_1(4) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeOptimize_1(11);
        System.out.println("isPrimeOptimize_1(11) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeOptimize_1(23);
        System.out.println("isPrimeOptimize_1(23) - " + isPrimeTest);

        System.out.println("-----------------------------------------");

        isPrimeTest = objPN.isPrimeOptimize_2(1);
        System.out.println("isPrimeOptimize_2(1) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeOptimize_2(2);
        System.out.println("isPrimeOptimize_2(2) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeOptimize_2(3);
        System.out.println("isPrimeOptimize_2(3) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeOptimize_2(4);
        System.out.println("isPrimeOptimize_2(4) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeOptimize_2(11);
        System.out.println("isPrimeOptimize_2(11) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeOptimize_2(23);
        System.out.println("isPrimeOptimize_2(23) - " + isPrimeTest);
        isPrimeTest = objPN.isPrimeOptimize_2(36);
        System.out.println("isPrimeOptimize_2(36) - " + isPrimeTest);
        */
    }
}
