package com.anilt.ds.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetectCycleLL 
{
	public static void main(String[] args) 
	{
		Node head = new Node(1);
		Node second = new Node(2);
		head.next = second;
		Node third = new Node(3);
		second.next = third;
		Node fourth = new Node(4);
		third.next = fourth;
		Node fifth = new Node(5);
		fourth.next = fifth;
		System.out.println(hasCycle(head));
		//fifth.next = third;//Making circular
		System.out.println(hasCycle(head));
		printLinkedList(head);
		insertNodeAtTail(head, 6);
		System.out.println();
		printLinkedList(head);
		
	}
	static void printLinkedList(Node head)
	{
		while(head != null)
		{
			System.out.print(head.data+" --> ");
			head = head.next;
		}
    }
	static Node insertNodeAtTail(Node head, int data)
	{
		if(head == null)
			return new Node(data);
		Node root = head;
		while(head.next != null)
		{
			head = head.next;
		}
		head.next = new Node(data);
		return root;
	}
	static boolean hasCycle(Node head) 
	{
		if(head==null)
	        return false;
	    else{
	        Node slow=head;
	        Node fast=head.next;
	        while(fast!=null && fast.next!=null && fast!=slow){
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        if( fast!=null && fast==slow)
	            return true;
	        return false;
	    }    
	}

}
