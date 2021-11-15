package com.anil.algo.twopointers;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSumII {
    public static void main(String[] args) {
        TwoSumII twoSumII = new TwoSumII();
        int numbers[] = {-1, 0};
        int target = -1;
        twoSumII.twoSum(numbers, target);
    }
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        Map<Integer, Integer> targetMap = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            if(targetMap.containsKey(numbers[i])){
                ans[0] = targetMap.get(numbers[i]);
                ans[1] = i+1;
                return ans;
            }
            targetMap.put(target-numbers[i], i+1);
        }
        return ans;
    }
}
