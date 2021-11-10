package com.anil.ds;

//https://leetcode.com/problems/maximum-subarray/
public class MaximumSubArray {
    public static void main(String[] args) {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int nums[] = {-1};
        //int nums[] = {-2,1,-3,4,-1,2,1,-5,4}; //Output: 6 Explanation: [4,-1,2,1] has the largest sum = 6.
        System.out.println(maximumSubArray.maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
        int maxSoFar = -1;
        int maxEndsHere = 0;
        for (int i=0; i<nums.length; i++){
            maxEndsHere = maxEndsHere + nums[i];
            if(maxSoFar < maxEndsHere)
                maxSoFar = maxEndsHere;
            if(maxEndsHere < 0)
                maxEndsHere = 0;
        }
        return maxSoFar;
    }
}
