package com.anil.ds.tree;

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
        TreeNode three1 = new TreeNode(3);
        q.right = three1;

        System.out.println(sameTree.isSameTree(p, q));
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        while (p != null && q != null){
            if(p.val != q.val){
                return false;
            }
            isSameTree(p.left, q.left);
            isSameTree(p.right, q.right);
        }
        return true;
    }
}
