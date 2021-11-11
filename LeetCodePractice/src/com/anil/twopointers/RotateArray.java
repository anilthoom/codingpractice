package com.anil.twopointers;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int nums[] = {-1,-100,3,99};
        int k = 5; // Output: [5,6,7,1,2,3,4]3  ,   [-1,-100,3,99] 2 , [-1]2 , [1,2] 3 , [1, 2, 3]4
        rotateArray.rotate(nums, k);
    }
    public void rotate(int[] nums, int k) {
        if(nums.length == 1 || nums.length == k) {
            //Don't do anything.
        }
        else if(nums.length < k){
            int timesToRotate = k%nums.length;
            rotate2(nums, timesToRotate);
        }
        else {
            rotate2(nums, k);
        }
    }
    public void rotate2(int[] nums, int k) {
        if(nums.length > k) {
            int rightArr[] = Arrays.copyOfRange(nums, nums.length-k, nums.length);
            int leftArr[] = Arrays.copyOfRange(nums, 0,nums.length-k);
            for(int i=0; i<rightArr.length; i++){
                nums[i] = rightArr[i];
            }
            int index = rightArr.length;
            for(int i=0; i<leftArr.length; i++){
                nums[index] = leftArr[i];
                index++;
            }
        }
    }
}
