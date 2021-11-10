package com.anil.binarysearch;
//https://leetcode.com/problems/binary-search/
public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int nums[] = {-1,0,3,5,9,12};
        int target = 0;
        System.out.println(binarySearch.search(nums, target));
        System.out.println(binarySearch.search(nums, target, 0, nums.length-1));
    }
    //Iterative
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

    //Recursive
    public int search(int[] nums, int target, int startIndex, int endIndex) {
        while (startIndex <= endIndex){
            int midIndex = startIndex + (endIndex-startIndex)/2;
            if(nums[midIndex] == target)
                return midIndex;
            if (nums[midIndex] < target)
                return search(nums, target, midIndex+1, endIndex);
            else if(nums[midIndex] > target)
                return search(nums, target, startIndex, midIndex-1);
        }
        return -1;
    }
    //https://leetcode.com/problems/first-bad-version/
    public int firstBadVersion(int n) {
        int start = 1; int end = n; int firstBadVersion = -1;
        while (start <= end){
            int mid = start +(end-start)/2;
            if(isBadVersion(mid)){
                firstBadVersion = mid;
                //move left
            }
        }
        return -1;
    }
    private boolean isBadVersion(int n){
        if(n==4)
            return true;
        else
            return false;
    }
}
