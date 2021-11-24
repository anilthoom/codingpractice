package com.anil.ds.tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class BinaryTreePreOrder {
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

        //rightNode.left = new TreeNode(3);

        BinaryTreePreOrder binaryTreePreOrder = new BinaryTreePreOrder();
        //binaryTreePreOrder.preorderTraversal(root);
        binaryTreePreOrder.levelOrder(root);

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
        if(root == null)
            return levelOrderList;

        List<Integer> nodeValues = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        LinkedList<TreeNode> nextNodes = new LinkedList<>();

        while (!queue.isEmpty()){
            TreeNode tempNode = queue.poll();

            if(tempNode.left != null){
                nextNodes.add(tempNode.left);
            }
            if(tempNode.right != null){
                nextNodes.add(tempNode.right);
            }
            nodeValues.add(tempNode.val);

            if(queue.isEmpty()){
                queue = nextNodes;
                nextNodes =  new LinkedList<>();
                levelOrderList.add(nodeValues);
                nodeValues = new ArrayList<>();
            }
        }
        return levelOrderList;
    }
    public static boolean printLevel(TreeNode root, int level)
    {
        // base case
        if (root == null) {
            return false;
        }

        if (level == 1)
        {
            System.out.print(root.val + " ");

            // return true if at least one node is present at a given level
            return true;
        }

        boolean left = printLevel(root.left, level - 1);
        boolean right = printLevel(root.right, level - 1);

        return left || right;
    }

    // Function to print level order traversal of a given binary tree
    public static void levelOrderTraversal(TreeNode root)
    {
        // start from level 1 — till the height of the tree
        int level = 1;

        // run till printLevel() returns false
        while (printLevel(root, level)) {
            level++;
        }
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