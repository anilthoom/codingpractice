package com.anilt.leetcode;

import java.util.Stack;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int nums[] = {3, 2, 1, 2, 3, 2};
        System.out.println(removeElement.removeElement(nums, 2));
    }
    public int removeElement(int[] nums, int val) {
        int[] resultNums = new int[nums.length];
        Stack<Integer> elements = new Stack<Integer>();

        for (int i=0; i<nums.length; i++){
            if(nums[i] != val){
                elements.push(nums[i]);
            }
        }
        int i=0;
        for (Integer filteredElements: elements){
            resultNums[i] = filteredElements;
            i++;
        }
        System.out.println(resultNums);
        return resultNums.length;
    }
}


