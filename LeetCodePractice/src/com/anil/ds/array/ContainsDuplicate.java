package com.anil.ds.array;

import java.util.Arrays;

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int nums[] = {1,2,3,12};
        System.out.println(containsDuplicate.containsDuplicate(nums));
    }
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i< nums.length; i++){
            if(i+1 >= nums.length)
                return false;
            else if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
