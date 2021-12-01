package com.anil.ds.tree;

import java.util.LinkedList;

public class MaximumDepthBinaryTree {
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

        MaximumDepthBinaryTree maximumDepthBinaryTree = new MaximumDepthBinaryTree();
        System.out.println(maximumDepthBinaryTree.maxDepth(root));
    }
    public int maxDepth(TreeNode root) {
        int treeHeight = 0;
        if(root == null)
            return treeHeight;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        LinkedList<TreeNode> nextNodes = new LinkedList<>();
        while (!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            if(tempNode.left != null)
                nextNodes.add(tempNode.left);
            if(tempNode.right != null)
                nextNodes.add(tempNode.right);
            if(queue.isEmpty()){
                treeHeight++;
                queue = nextNodes;
                nextNodes = new LinkedList<>();
            }

        }
        return treeHeight;
    }
}
