package com.anilt.leetcode;

import java.util.Stack;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        RemoveDuplicateSortedArray rDSA = new RemoveDuplicateSortedArray();
        int nums[] = {1, 1, 3, 4};
        System.out.println(rDSA.removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums) {
        Stack<Integer> elements = new Stack<Integer>();
        for (int i=0; i<nums.length; i++){
            if(i+1 < nums.length) {
                if(nums[i] != nums[i+1]){
                    elements.push(nums[i]);
                }
            }
            else {
                elements.push(nums[i]);
            }
        }
        int i=0;
        for (Integer filteredElements: elements){
            nums[i] = filteredElements;
            i++;
        }
        return elements.size();
    }
}
