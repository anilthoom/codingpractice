package com.anil.ds.tree;

import java.util.List;

//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class BinaryTreePreOrder {
    public static void main(String[] args) {

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        return null;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
     }
}