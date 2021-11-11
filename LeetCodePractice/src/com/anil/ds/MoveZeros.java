package com.anil.ds;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/
public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int nums[] = {0,1,0,3,12}; //Output: [1,3,12,0,0]
        moveZeros.moveZeroes(nums);
    }
    //Note that you must do this in-place without making a copy of the array.
    public void moveZeroes(int[] nums) {
        boolean needOneMoreIteration = false;
        boolean confirmForNextIteration = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0 && i+1<nums.length){
                if(nums[i+1] == 0){
                    needOneMoreIteration = true;
                }
                else {
                    nums[i] = nums[i+1];
                    nums[i+1] = 0;
                    if(needOneMoreIteration){
                        confirmForNextIteration = true;
                    }
                }
            }
        }
        if(needOneMoreIteration & confirmForNextIteration){
            needOneMoreIteration = false;
            moveZeroes(nums);
        }
    }
}
