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
        System.out.println(validBST.isValidBST(root));
    }

    static boolean isBST(TreeNode root, TreeNode leftNode, TreeNode rightNode)
    {
        // Base condition
        if (root == null)
            return true;

        // if left node exist then check it has
        // correct data or not i.e. left node's data
        // should be less than root's data
        if (leftNode != null && root.val <= leftNode.val)
            return false;

        // if right node exist then check it has
        // correct data or not i.e. right node's data
        // should be greater than root's data
        if (rightNode != null && root.val >= rightNode.val)
            return false;

        // check recursively for every node.
        return isBST(root.left, leftNode, root) &&
                isBST(root.right, root, rightNode);
    }
    public boolean isValidBST(TreeNode root){
        return isBST(root, null, null);
    }
    public boolean isValidBSTWRONG(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        LinkedList<TreeNode> nextNodes = new LinkedList<>();
        while (!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            if(tempNode.left != null){
                nextNodes.add(tempNode.left);
                if(tempNode.val <= tempNode.left.val)
                    return false;
            }
            if(tempNode.right != null){
                nextNodes.add(tempNode.right);
                if(tempNode.val >= tempNode.right.val)
                    return false;
            }
            if(queue.isEmpty()){
                queue = nextNodes;
                nextNodes = new LinkedList<>();
            }
        }
        return true;
    }
}
