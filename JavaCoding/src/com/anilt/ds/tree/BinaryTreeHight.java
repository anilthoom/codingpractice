package com.anilt.ds.tree;

import java.util.Scanner;

public class BinaryTreeHight 
{
	public static int height2(Node root) 
	{
		return height(root)-1;
	}
	public static int height(Node root) 
    {
      	if (root == null) 
           return -1;
      	else if(root.left == null && root.right ==null)
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println(bst.checkBST(root));
    }	
}
