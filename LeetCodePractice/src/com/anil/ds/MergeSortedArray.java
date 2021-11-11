package com.anil.ds;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int nums2[] = {2,5,6};
        int n = 3;
        mergeSortedArray.merge(nums1, m, nums2, n);
        System.out.println(nums1);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<nums2.length; i++){
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    }
}
