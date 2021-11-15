package com.anil.algo.twopointers;

import java.util.Arrays;

//https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquaresOfSortedArray {
    public static void main(String[] args) {
        SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();
        int nums[] = {-4,-1,0,3,10};
        squaresOfSortedArray.sortedSquares(nums);
    }
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            ans[i] = nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
