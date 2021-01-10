package com.anilt.ds.linkedlist;

public class DLL 
{
	static NodeC head;
	public static void main(String[] args) 
	{
		DLL dLList = new DLL();
		dLList.head = new NodeC(1);
		
		NodeC second = new NodeC(2);
		second.previous = dLList.head;
		dLList.head.next = second;
		
		NodeC third = new NodeC(3);
		second.next = third;
		third.previous = second;
		
		NodeC foruth = new NodeC(4);
		third.next = foruth;
		foruth.previous = third;
		
		//dLList.head.previous = foruth; //TO make it circular
		
		printLL(head);
		reverse(head);
	}
	static void printLL(NodeC nLL)
	{
		while(nLL != null)
		{
			System.out.print(nLL.data + " <--> ");
			nLL = nLL.next;
		}
		System.out.print("NULL\n");
		
	}
	static NodeC reverse(NodeC head) 
	{
		NodeC reverseHead = null;
		while(head != null)
		{
			reverseHead = head;
			head = head.next;
		}
		NodeC reverseDLL = new NodeC(reverseHead.data);
		createDLLReverse(reverseDLL, reverseHead);
		return reverseDLL;
    }
	static NodeC createDLLReverse(NodeC reverseDLL, NodeC reverseHead)
	{
		if(reverseHead == null)
			return reverseDLL;
		while(reverseHead != null)
		{
			if(reverseHead.previous != null)
			{
				reverseDLL.next = new NodeC(reverseHead.previous.data);
			}
			if(reverseHead.next != null)
			{
				reverseDLL.previous = new NodeC(reverseHead.next.data);
			}
			return createDLLReverse(reverseDLL.next, reverseHead.previous);
		}
		return reverseDLL;
	}
}
class NodeC
{
	int data;
	NodeC next;
	NodeC previous;
	NodeC(int d)
	{
		this.data = d;
	}
}