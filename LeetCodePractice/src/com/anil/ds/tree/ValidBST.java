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
    boolean isBSTUtil(TreeNode node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.val < min || node.val > max)
            return false;

        /* otherwise, check the subtrees recursively tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.val-1) &&
                isBSTUtil(node.right, node.val+1, max));
    }
    // Returns true if given tree is BST.
    static boolean isBST(TreeNode root, TreeNode l, TreeNode r)
    {
        // Base condition
        if (root == null)
            return true;

        // if left node exist then check it has
        // correct data or not i.e. left node's data
        // should be less than root's data
        if (l != null && root.val <= l.val)
            return false;

        // if right node exist then check it has
        // correct data or not i.e. right node's data
        // should be greater than root's data
        if (r != null && root.val >= r.val)
            return false;

        // check recursively for every node.
        return isBST(root.left, l, root) &&
                isBST(root.right, root, r);
    }
    public boolean isValidBST(TreeNode root){
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
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
