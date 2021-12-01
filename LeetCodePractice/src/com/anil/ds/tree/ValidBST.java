package com.anil.ds.tree;

import java.util.LinkedList;

public class ValidBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        root.left = two;
        TreeNode three = new TreeNode(3);
        root.right = three;
        two.left = new TreeNode(4);
        two.right = new TreeNode(5);
        three.left = new TreeNode(6);
        three.right = new TreeNode(7);

        ValidBST validBST = new ValidBST();
    }
    public boolean isValidBST(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        LinkedList<TreeNode> nextNodes = new LinkedList<>();
        while (!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
        }
        return true;
    }
}
