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
        String nodeValStr = "";
        LinkedList<TreeNode> nextNodes = new LinkedList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            nodeValStr += ""+tempNode.val;
            if(tempNode.left !=null || tempNode.right!=null){
                if(tempNode.left == null){
                    nodeValStr += "X";
                }
                else if(tempNode.left!=null){
                    nextNodes.add(tempNode.left);
                }
                if(tempNode.right == null){
                    nodeValStr += "X";
                }
                else if(tempNode.right != null){
                    nextNodes.add(tempNode.right);
                }
            }
            if(queue.isEmpty()){
                if(!isPalindrome(nodeValStr))
                    return false;
                queue = nextNodes;
                nextNodes = new LinkedList<>();
                nodeValStr = "";
            }
        }
        return true;
    }
    public boolean isPalindrome(String str){
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        return str.contentEquals(buffer);
    }
}
