package com.anilt.ds.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree 
{
	Node root;
	
	BinaryTree(int key)
	{
		root = new Node(key);
	}
	BinaryTree()
	{
		root = null;
	}
	
	/*public static void main(String[] args) 
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.right.right = new Node(5);
		topView(tree.root);
		
	}*/
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.key) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) 
    {
    	/*
    	 * * Sample Input * *
    	 *   8
		 *	 5 3 6 4 1 2 7 8
    	 */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
//        topView(root);
        System.out.println("LEVEL ORDER: ");
        printLevelOrder(root);
        System.out.println("\nPRE ORDER: ");
        printPreOrder(root);
        System.out.println("\nIN ORDER: ");
        inOrder(root);
        System.out.println("\nPOST ORDER: ");
        printPostOrder(root);
    }
    public static void printPreOrder(Node root)
    {
    	if(root == null)
    		return;
    	System.out.print(root.key+" ");
    	printPreOrder(root.left);
    	printPreOrder(root.right);
    }
    public static void inOrder(Node root)
    {
    	if(root == null)
    		return;
    	inOrder(root.left);
    	System.out.print(root.key+" ");
    	inOrder(root.right);
    }
    public static void printPostOrder(Node root)
    {
    	if(root == null)
    		return;
    	printPostOrder(root.left);
    	printPostOrder(root.right);
    	System.out.print(root.key+" ");
    }
    public static void printLevelOrder(Node root)
    {
    	Queue<Node> queue = new LinkedList<Node>(); 
        queue.add(root); 
        while (!queue.isEmpty())  
        { 
  
            /* poll() removes the present head. 
            For more information on poll() visit  
            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
            Node tempNode = queue.poll(); 
            System.out.print(tempNode.key + " "); 
  
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
	public static void topView(Node root) 
	{
		while(root != null)
		{
			System.out.print(root.key+" ");
			root = root.right;
		}
    }
}
class Node
{
	Node left, right;
	int key;
	public Node(int key)
	{
		this.key = key;
		left = right = null;
	}
}
