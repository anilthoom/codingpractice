package com.anil.ds.array;

import java.util.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int nums[] = {4, 1, 2, 1, 2};
        System.out.println(singleNumber.singleNumber(nums));
    }
    public int singleNumber(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum ^= i;
        }
        return sum;
    }
    public int singleNumberBF(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i=i+2){
            if(nums[i] != nums[i+1])
                return nums[i];
        }
        return nums[nums.length-1];
    }
}
