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
                System.out.println(result[i]);
            }
        }
        else {
            System.out.println("No target found or invalid input");
        }
    }
    public int[] twoSum(int[] nums, int target) {
        return null;
    }
}
