package com.anil.ds.tree;
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/631/
public class ConvertSortedArrToBST {
    public static void main(String[] args) {
        ConvertSortedArrToBST convertSortedArrToBST = new ConvertSortedArrToBST();
        int nums[] = {-10,-3,0,5,9, 10};
        convertSortedArrToBST.sortedArrayToBST(nums);
    }

    /**
     * Given an integer array nums where the elements are sorted in ascending order,
     * convert it to a height-balanced binary search tree.
     * A height-balanced binary tree is a binary tree in which the depth of the
     * two subtrees of every node never differs by more than one.
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode();
        int middle = nums.length/2;
        System.out.println(middle);
        return root;
    }
}
