package com.anilt.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

//Level order traversal of a tree is breadth first traversal for the tree.
public class BreadthFirstTraversal 
{
	TreeNode root;
	public BreadthFirstTraversal() 
	{
		root = null;
	}
	/* Compute the "height" of a tree -- the number of 
    nodes along the longest path from the root node 
    down to the farthest leaf node.*/
    int height(TreeNode root) 
    { 
        if (root == null) 
           return 0; 
        else
        { 
            /* compute  height of each subtree */
            int lheight = height(root.left); 
            int rheight = height(root.right); 
              
            /* use the larger one */
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    }
    void printLevelOrderUsingQueue()  
    { 
        Queue<TreeNode> queue = new LinkedList<TreeNode>(); 
        queue.add(root); 
        while (!queue.isEmpty())  
        { 
  
            /* poll() removes the present head. 
            For more information on poll() visit  
            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
            TreeNode tempNode = queue.poll(); 
            System.out.print(tempNode.data + " "); 
  
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
  
	void printLevelOrder()
	{
		int h = height(root);
		for(int i=1; i<=h; i++)
		{
			printGivenLevel(root, i);
		}
	}
	
	 /* Print nodes at the given level */
    void printGivenLevel (TreeNode root ,int level) 
    { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.data + " "); 
        else if (level > 1) 
        { 
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
        } 
    } 
	public static void main(String[] args) 
	{
		BreadthFirstTraversal tree = new BreadthFirstTraversal();
	    tree.root= tree.new TreeNode(1); 
	    tree.root.left= tree.new TreeNode(2); 
	    tree.root.right= tree.new TreeNode(3); 
	    tree.root.right.left= tree.new TreeNode(4); 
	    tree.root.right.right= tree.new TreeNode(5);
	    
	    System.out.println("Tree Height : "+ tree.height(tree.root));
//	    tree.printLevelOrder();
	    tree.printLevelOrderUsingQueue();
	}

	class TreeNode
	{
		int data;
		TreeNode left, right;
		public TreeNode(int data)
		{
			this.data = data;
			left = right = null;
		}
	}
}
