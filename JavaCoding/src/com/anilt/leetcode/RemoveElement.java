package com.anilt.leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int nums[] = {3, 2, 1, 2, 3, 2};
        System.out.println(removeElement.removeElement(nums, 2));
    }
    public int removeElement(int[] nums, int val) {
        int[] resultNums = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            if(nums[i] != val){
                resultNums[i] = nums[i];
            }
        }
        System.out.println(resultNums);
        return resultNums.length;
    }
}


