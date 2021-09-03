package com.anilt.faang.arrays;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arr = {1, 2, 3, 4, 5};
        int target = 7;
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
    public int[] twoSum(int[] nums, int target) {
        int answer[] = new int[2];
        if(nums == null || nums.length<2){
            return null;
        }
        else {
            for (int i=0; i<nums.length-1; i++){
                if((nums[i] + nums[i+1]) == target){
                    answer[0] = i;
                    answer[1] = i+1;
                }
            }
        }
        return answer;
    }
}
