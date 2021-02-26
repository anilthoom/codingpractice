//https://leetcode.com/problems/two-sum/
package com.anilt.leetcode;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2,11,7, 15};
        int target = 9;
        int result[] = twoSum(nums, target);
        System.out.println(result[0]+","+ result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return null;
    }
}
