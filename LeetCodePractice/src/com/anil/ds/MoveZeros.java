package com.anil.ds;

//https://leetcode.com/problems/move-zeroes/
public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int nums[] = {0,1,0,3,12}; //Output: [1,3,12,0,0]
        moveZeros.moveZeroes(nums);
    }
    public void moveZeroes(int[] nums) {
        int ans[] =  new int[nums.length];
        int index = 0;
        int zeroCounter = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                ans[index] = nums[i];
                index++;
            }
            else {
                zeroCounter++;
            }
        }
        int ansCounter = ans.length;
        for(int i=0; i<zeroCounter; i++){
            ansCounter = ansCounter-1;
            ans[ansCounter] = 0;
        }
    }
}
