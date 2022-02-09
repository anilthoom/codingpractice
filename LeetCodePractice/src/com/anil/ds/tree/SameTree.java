package com.anil.ds.tree;

//https://leetcode.com/problems/same-tree/
public class SameTree {
    public static void main(String[] args) {
        SameTree sameTree = new SameTree();
        TreeNode p = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        p.left = two;
        TreeNode three = new TreeNode(3);
        p.right = three;

        TreeNode q = new TreeNode(1);
        TreeNode two1 = new TreeNode(2);
        q.left = two1;
        TreeNode three1 = new TreeNode(4);
        q.right = three1;

        System.out.println(sameTree.isSameTree(p, q));
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        if(p.val != q.val)
            return false;
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}
