package com.anil.binarysearch;
//https://leetcode.com/problems/binary-search/
public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(binarySearch.search(nums, target));
    }
    public int search(int[] nums, int target) {
        // get the mid pointer
        int pointer = nums.length/2;
        System.out.println(pointer);

        return -1;
    }
}
