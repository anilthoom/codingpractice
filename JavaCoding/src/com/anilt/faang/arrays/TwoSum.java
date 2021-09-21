package com.anilt.faang.arrays;

import java.util.*;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arr = {3, 2, 4};
        int target = 6;
        int result[] = twoSum.twoSumFast(arr, target);
        //int result[] = twoSum.twoSum(arr, target);
        if(result != null){
            for(int i=0; i<result.length; i++){
                System.out.print(result[i]+ " ");
            }
        }
        else {
            System.out.println("No target found or invalid input");
        }
    }
    //Optimal solution O(n)
    public int[] twoSumFast(int[] nums, int target){
        Map<Integer, Integer> targetMap = new HashMap<Integer, Integer>();
        int findNum;
        int ans[] = new int[2];
        for(int i=0; i< nums.length; i++){
            findNum = target - nums[i];
            if(targetMap.containsKey(nums[i])){
                ans[1] = i;
                ans[0] = targetMap.get(nums[i]);
                return ans;
            }
            targetMap.put(findNum, i);
        }
        return null;
    }
    //Brut force approach O(n^2)
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
