package com.anilt.ds.tree;

public class BinarySearchTree 
{
	public static void main(String[] args) 
	{
//		int[] arr = {4, 2, 3, 1, 7, 6};
		int[] arr = {8, 4, 9, 1, 2, 3, 6, 5};

		Node root = new Node(arr[0]);
		for(int i=1; i<arr.length; i++)
		{
			insertNode(root, root, arr[i]);
		}
		Node found = findNode(root, 8); 
		if( found != null)
			System.out.println("FOUND : "+found.key);
		else
			System.out.println("NOT EXISTS");
		
		System.out.println("TREE HEIGHT : " +treeHeight(root));
		Node result = lca(root, 1, 2);
		System.out.println("LCA is : "+result.key);
		
		System.out.println("IS BST : "+ checkBST(root));
	}
	static boolean checkBST(Node root) 
	{
		if(root == null)
		{
			return true;
		}
		if(root.left == null || root.right == null)
		{
			return true;
		}
		if((root.left.key < root.key) && (root.key < root.right.key))
		{
			boolean isLeftOk = checkBST(root.left);
			boolean isRightOk = checkBST(root.right);
			if(isLeftOk && isRightOk)
				return true;
			else
				return false;
		}
		else
			return false;
    }
	//Lowest Common Ancestor
	public static Node lca(Node currentNode, int v1, int v2) 
	{
		if(v1 < currentNode.key && v2 > currentNode.key )
		{
			//Lowest Common Ancestor
			return currentNode;
		}
		else if(v1 > currentNode.key && v2 < currentNode.key)
		{
			//Lowest Common Ancestor
			return currentNode;
		}
		else if(v1 > currentNode.key && v2 > currentNode.key)
		{
			return lca(currentNode.right, v1, v2);
		}
		else if(v1 < currentNode.key && v2 < currentNode.key)
		{
			return lca(currentNode.left, v1, v2);
		}
		else if(v1 == currentNode.key || v2== currentNode.key)
		{
			return currentNode;
		}
		return currentNode;
	}

	static int treeHeight(Node root)
	{
		if(root == null)
		{
			return -1;
		}
		else if(root.left == null && root.right == null)
		{
			return 0;
		}
		else
		{
			int lTreeHeight = treeHeight(root.left);
			int rTreeHeight = treeHeight(root.right);
			if(lTreeHeight > rTreeHeight)
				return lTreeHeight+1;
			else
				return rTreeHeight+1;
		}		
	}
	static Node findNode(Node parentNode, int data)
	{
		if(parentNode == null)
		{
			return null;
		}
		if(data == parentNode.key)
		{
			return parentNode;
		}
		else if(data < parentNode.key)
		{
			return findNode(parentNode.left, data);
		}
		else
		{
			return findNode(parentNode.right, data);
		}
	}
	static Node insertNode(Node previousNode, Node parentNode, int data)
	{
		if(parentNode == null)
		{
			if(data < previousNode.key)
			{
				previousNode.left = new Node(data);
				return previousNode.left;
			}
			else
			{
				previousNode.right = new Node(data);
				return previousNode.right;
			}
		}
		else if(data < parentNode.key)
		{
			//GO LEFT
			return insertNode(parentNode, parentNode.left, data);
		}
		else
		{
			//GO RIGHT
			return insertNode(parentNode, parentNode.right, data);
		}
	}
}
/*
class Node
{
	Node left, right;
	int key;
	public Node(int value) 
	{
		left = right = null;
		this.key = value;
	}
}*/