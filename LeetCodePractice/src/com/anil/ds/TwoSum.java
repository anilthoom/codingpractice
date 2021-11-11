package com.anil.ds;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int nums[] = {2,7,11,15};
        int target = 9; // Output: [0,1] Because nums[0] + nums[1] == 9, we return [0, 1].
        System.out.println(twoSum.twoSum(nums, target));
    }
    public int[] twoSum(int[] nums, int target) {
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

}
