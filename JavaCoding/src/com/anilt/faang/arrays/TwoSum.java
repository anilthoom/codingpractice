package com.anilt.faang.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arr = {1, 5, 11, 4, 9};
        int target = 20;
        twoSum.twoSumFast(arr, target);
        int result[] = twoSum.twoSum(arr, target);
        if(result != null){
            for(int i=0; i<result.length; i++){
                System.out.print(result[i]+ " ");
            }
        }
        else {
            System.out.println("No target found or invalid input");
        }
    }
    //Optimal solution
    public int[] twoSumFast(int[] nums, int target){
        List listNums = Arrays.asList(nums);
        int findNum;
        for(int i=0; i< nums.length; i++){
            findNum = target - nums[i];
            System.out.println(listNums.indexOf(findNum));
        }
        return null;
    }
    //Brut force approach
    public int[] twoSum(int[] nums, int target) {
       int answer[] = new int[2];
       for (int i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }
}
