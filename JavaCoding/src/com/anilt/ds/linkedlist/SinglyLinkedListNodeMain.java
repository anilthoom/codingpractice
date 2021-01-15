package com.anilt.ds.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

public class SinglyLinkedListNodeMain 
{
	public static void main(String[] args) 
	{
		SinglyLinkedListNode head = insertNodeAtTail(null, 1);
		insertNodeAtTail(head, 2);
		insertNodeAtTail(head, 3);
		insertNodeAtTail(head, 10);
		insertNodeAtTail(head, 4);
		insertNodeAtTail(head, 5);
		
		/*
		 * printLinkedList(head); deleteNode(head, 3); System.out.println();
		 * printLinkedList(head); System.out.println(); reversePrint(head);
		 * reverse(head);
		 */		
		SinglyLinkedListNode h1 = insertNodeAtTail(null, 1);
		insertNodeAtTail(h1, 2);
		SinglyLinkedListNode h2 = insertNodeAtTail(null, 1);
//		insertNodeAtTail(h2, 1);
		
		//System.out.println(compareLists(h1, h2));
		
		SinglyLinkedListNode sortedList1 = insertNodeAtTail(null, 1);
		insertNodeAtTail(sortedList1, 2);
		insertNodeAtTail(sortedList1, 3);
		insertNodeAtTail(sortedList1, 4);
		
		SinglyLinkedListNode sortedList2 = insertNodeAtTail(null, 3);
		insertNodeAtTail(sortedList2, 5);
		
		findMergeNode(sortedList1, sortedList2);
		mergeLists(sortedList1, sortedList2);
//		getNode(sortedList1, 2);
//		hasCycle(sortedList1);
		//removeDuplicates(sortedList1);
		
	}
	//https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem
	static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) 
	{
		SinglyLinkedListNode listToCheck;
		while(head1 != null)
		{
			listToCheck = head2;
			int data1 = head1.data;
			while(listToCheck !=null)
			{
				if(listToCheck.data == data1)
					return data1;
				listToCheck = listToCheck.next;
			}
			head1 = head1.next;
		}
		return -1;
    }
	//Remove duplicates from sorted list
	static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode sortedLL) 
	{
		TreeSet<Integer> sortedSet = new TreeSet<Integer>();
		while(sortedLL != null)
		{
			sortedSet.add(sortedLL.data);
			sortedLL = sortedLL.next;
		}
		if(!sortedSet.isEmpty())
		{
			SinglyLinkedListNode newList = new SinglyLinkedListNode(sortedSet.pollFirst());
			SinglyLinkedListNode previousNode = newList;
			for (Integer val : sortedSet) 
			{
				SinglyLinkedListNode newNode = new SinglyLinkedListNode(val);
				previousNode.next = newNode;
				previousNode = newNode;
			}
			return newList;
		}
		else
		{
			return null;
		}
			
    }
	static boolean hasCycle(SinglyLinkedListNode head) 
	{
		ArrayList<Integer> visitedNodes = new ArrayList<Integer>();
		while(head != null)
		{
			if(visitedNodes.contains(head.data))
			{
				return true;
			}
			else
			{
				visitedNodes.add(head.data);
				head = head.next;
			}
		}
		return false;
    }
	static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) 
	{
		List<Integer> mergedSortedList = new ArrayList<Integer>();
		while(head1 !=null)
		{
			mergedSortedList.add(head1.data);
			head1 = head1.next;
		}
		while(head2 !=null)
		{
			mergedSortedList.add(head2.data);
			head2 = head2.next;
		}
		Collections.sort(mergedSortedList);
		SinglyLinkedListNode mergedLL = new SinglyLinkedListNode(mergedSortedList.get(0));
		SinglyLinkedListNode previousNode = mergedLL;
		for (int i=1; i<mergedSortedList.size(); i++)
		{
			SinglyLinkedListNode newNode = new SinglyLinkedListNode(mergedSortedList.get(i));
			previousNode.next = newNode;
			previousNode = newNode;
		}
		return mergedLL;
    }	
	static int getNode(SinglyLinkedListNode head, int positionFromTail) 
	{
		Stack<Integer> elements = new Stack<Integer>();
		while(head != null)
		{
			elements.add(head.data);
			head = head.next;
		}
		int size = elements.size();
		for(int i = 0; i<size; i++)
		{
			if(i == positionFromTail)
				return elements.pop();
			else
				elements.pop();
		}
		return -1;
    }
	static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) 
	{
		boolean result = false;
		while(head1 != null && head2 != null)
		{
			if(head1.data == head2.data)
			{
				result = true;
				head1 = head1.next;
				head2 = head2.next;
			}
			else
			{
				return false;
			}
		}
		if(head1 == null && head2 == null && result == true)
			return true;
		else
			return false;
    }
	static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data)
	{
		if(head == null)
			return new SinglyLinkedListNode(data);
		SinglyLinkedListNode root = head;
		while(head.next != null)
		{
			head = head.next;
		}
		head.next = new SinglyLinkedListNode(data);
		return root;
	}
	static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) 
	{
		if(head == null)
			return null;
		if(position == 0)
		{
			head = head.next;
			return head;
		}
		SinglyLinkedListNode previousNode =null, nodeToDelete = null, root = head;
		for(int counter = 0; counter < position; counter++)
		{
			previousNode = head;
			nodeToDelete = head.next;
			head = head.next;
		}
		if(nodeToDelete != null && previousNode != null)
		{
			previousNode.next = nodeToDelete.next;
		}
		return root;
    }
	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) 
	{	
		SinglyLinkedListNode head = new SinglyLinkedListNode(data);
		head.next = llist;
		return head;
    }
	static void reversePrint(SinglyLinkedListNode head) 
	{
		Stack<Integer> elements = new Stack<Integer>();
		while(head != null)
		{
			elements.add(head.data);
			head = head.next;
		}
		int size = elements.size();
		for(int i = 0; i<size; i++)
		{
			System.out.println(elements.pop());
		}
    }
	static SinglyLinkedListNode reverse(SinglyLinkedListNode head) 
	{
		SinglyLinkedListNode reverseList = null;
		Stack<Integer> elements = new Stack<Integer>();
		while(head != null)
		{
			elements.add(head.data);
			head = head.next;
		}
		reverseList = new SinglyLinkedListNode(elements.pop());
		SinglyLinkedListNode node = reverseList;
		int size = elements.size();
		for(int i = 0; i<size; i++)
		{
			SinglyLinkedListNode newNode = new SinglyLinkedListNode(elements.pop());
			node.next = newNode;
			node = newNode;
		}
		return reverseList;
    }
	static void printLinkedList(SinglyLinkedListNode head)
	{
		while(head != null)
		{
			System.out.print(head.data+" --> ");
			head = head.next;
		}
    }
}
class SinglyLinkedListNode
{
	int data;
	SinglyLinkedListNode next;
	public SinglyLinkedListNode(int d) 
	{
		this.data = d;
		this.next = null;
	}
}