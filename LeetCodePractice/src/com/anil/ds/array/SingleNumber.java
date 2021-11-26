package com.anil.ds.array;

import java.util.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int nums[] = {4, 1, 2, 1, 2, 4, 5, 5, 3};
        System.out.println(singleNumber.singleNumber(nums));
    }
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        return -1;
    }
}
