package com.anil.binarysearch;
//https://leetcode.com/problems/binary-search/
public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int nums[] = {-1,0,3,5,9,12};
        int target = 1;
        System.out.println(binarySearch.search(nums, target));
    }
    public int search(int[] nums, int target) {
       int startIndex =0;
       int endIndex = nums.length-1;
       while(startIndex <= endIndex){
           int midIndex = startIndex +(endIndex-startIndex)/2;
           if(nums[midIndex] == target){
               return midIndex;
           }

           if(nums[midIndex] < target){
               startIndex = midIndex+1;
           }
           else if(nums[midIndex] > target){
               endIndex = midIndex-1;
           }
       }
       return -1;
    }
}
