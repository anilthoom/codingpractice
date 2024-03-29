package com.anilt.leetcode.general;

public class SearchIInsertIndex {
    public static void main(String[] args) {
        SearchIInsertIndex sII = new SearchIInsertIndex();
        //Sorted Array
        int[] nums = {1, 3, 4, 6};
        System.out.println(sII.searchInsert(nums, 7));
    }
    public int searchInsert(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            if(target <= nums[i])
                return i;
        }
        return nums.length;
    }
}
