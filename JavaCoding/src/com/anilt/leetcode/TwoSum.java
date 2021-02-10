//https://leetcode.com/problems/two-sum/
package com.anilt.leetcode;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int result[] = twoSum(nums, target);
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]+nums[i+1]);
        }
        return null;
    }
}
