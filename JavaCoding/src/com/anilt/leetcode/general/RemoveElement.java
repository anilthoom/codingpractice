package com.anilt.leetcode.general;

import java.util.Stack;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int nums[] = {3, 2, 2, 3};
        System.out.println(removeElement.removeElement(nums, 3));
    }
    public int removeElement(int[] nums, int val) {
        Stack<Integer> elements = new Stack<Integer>();

        for (int i=0; i<nums.length; i++){
            if(nums[i] != val){
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


