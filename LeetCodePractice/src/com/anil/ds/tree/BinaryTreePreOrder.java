package com.anil.ds.tree;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class BinaryTreePreOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        TreeNode rightNode = new TreeNode(2);
        root.right = rightNode;
        //rightNode.left = new TreeNode(3);

        BinaryTreePreOrder binaryTreePreOrder = new BinaryTreePreOrder();
        binaryTreePreOrder.preorderTraversal(root);

    }
    List<Integer> nodesList = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null){
            nodesList.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return nodesList;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null){
            inorderTraversal(root.left);
            nodesList.add(root.val);
            inorderTraversal(root.right);
        }
        return nodesList;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root != null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            nodesList.add(root.val);
        }
        return nodesList;
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