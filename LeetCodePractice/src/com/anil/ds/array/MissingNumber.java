package com.anil.ds.array;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        int nums[] = {2, 0, 1, 3, 5};
        System.out.println(missingNumber.missingNumber(nums));
    }
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i =0; i<nums.length; i++){
            if(i != nums[i])
                return i;
        }
        return nums.length;
    }
}
