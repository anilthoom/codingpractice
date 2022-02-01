package com.anil.ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        TreeNode three1 = new TreeNode(3);
        q.right = three1;

        System.out.println(sameTree.isSameTree(p, q));
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> pValues = new ArrayList<>();
        LinkedList<TreeNode> pQueue = new LinkedList<>();
        LinkedList<TreeNode> nextPNodes = new LinkedList<>();
        pQueue.add(p);
        while (p != null){
            TreeNode tempNode = pQueue.poll();
            if(tempNode.left != null){
                nextPNodes.add(tempNode.left);
            }
            if(tempNode.right != null){
                nextPNodes.add(tempNode.right);
            }
        }
        return true;
    }
}
