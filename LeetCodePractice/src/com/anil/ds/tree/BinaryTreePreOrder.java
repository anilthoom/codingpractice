package com.anil.ds.tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrderList = new ArrayList<>();
        parseLevelOrder(root, levelOrderList);
        return levelOrderList;
    }
    public void parseLevelOrder(TreeNode root, List<List<Integer>> list){

    }
    public static void printLevelOrder(TreeNode root)
    {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            /* poll() removes the present head.
            For more information on poll() visit
            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
            TreeNode tempNode = queue.poll();
            System.out.print(tempNode.val + " ");

            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
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