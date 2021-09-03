package com.anilt.faang.arrays;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arr = {1, 5, 11, 4, 9};
        int target = 20;
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
                for (int j=i+1; j<nums.length; j++){
                    if(nums[i] + nums[j] == target){
                        answer[0] = i;
                        answer[1] = j;
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
