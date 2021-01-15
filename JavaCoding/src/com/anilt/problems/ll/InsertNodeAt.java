package com.anilt.problems.ll;

public class InsertNodeAt 
{
	public static void main(String[] args) 
	{
		SinglyLinkedListNode head = new SinglyLinkedListNode(16);
		SinglyLinkedListNode second = new SinglyLinkedListNode(13);
		head.next = second;
		SinglyLinkedListNode third = new SinglyLinkedListNode(7);
		second.next = third;
		SinglyLinkedListNode.insertNodeAtPosition(head, 1, 2);
	}

}
class SinglyLinkedListNode 
{
	int data;
	SinglyLinkedListNode next;
	public SinglyLinkedListNode(int d) 
	{
		data = d;
		next = null;
	}
	static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) 
	{
		if(head == null)
		{
			head = new SinglyLinkedListNode(data);
			head.next = null;
		}
		else
		{
			SinglyLinkedListNode currentNode = head;
			int counter = -1;
			SinglyLinkedListNode previousNode = null; 
			while( currentNode !=null )
			{
				counter++;
				if(position-1 == counter)
				{
					previousNode = currentNode;
					currentNode = currentNode.next;
				}
				else if(position == counter)
				{
					SinglyLinkedListNode nodeToInsert = new SinglyLinkedListNode(data);
					nodeToInsert.next = currentNode;
					previousNode.next = nodeToInsert;
				}
				else
				{
					currentNode = currentNode.next;
				}
			}
		}
		return head;
	}

}
    
    
   