package com.anil.ds;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3; // Output: [5,6,7,1,2,3,4]
        rotateArray.rotate(nums, k);
    }
    public void rotate(int[] nums, int k) {
        int rightArr[] = Arrays.copyOfRange(nums, nums.length-3, nums.length);
        int leftArr[] = Arrays.copyOfRange(nums, 0,nums.length-3);
        nums = rightArr;
        System.out.println();
    }
}
