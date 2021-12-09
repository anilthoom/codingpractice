package com.anil.ds.tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/627/
public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        root.left = two;
        TreeNode three = new TreeNode(2);
        root.right = three;
        two.left = new TreeNode(4);
        //two.right = new TreeNode(5);
        //three.left = new TreeNode(5);
        three.right = new TreeNode(4);

        SymmetricTree symmetricTree = new SymmetricTree();
        System.out.println(symmetricTree.isSymmetric(root));
    }
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    public boolean isMirror(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null)
            return true;
        if(node1 != null && node2 != null && node1.val == node2.val)
            return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));
        return false;
    }
}
