package com.anilt.ds.tree;

import java.util.Scanner;

public class TopViewTree 
{
	//https://www.hackerrank.com/challenges/tree-top-view/problem
	//TODO: INCOMPLETE DUE TO LACK OF CLARITY ON QUESTION
	public static void topView(TreeViewNode root) 
    {
        while(root != null)
        {
            System.out.print(root.data+" ");
            root = root.right;
        }
    }

	public static TreeViewNode insert(TreeViewNode root, int data) {
        if(root == null) {
            return new TreeViewNode(data);
        } else {
        	TreeViewNode cur;
            if(data <= root.data) {
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
        TreeViewNode root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	

}
class TreeViewNode
{
	int data;
	TreeViewNode left;
	TreeViewNode right;
	public TreeViewNode(int d) 
	{
		this.data = d;
		this.left = null;
		this.right = null;
	}
}