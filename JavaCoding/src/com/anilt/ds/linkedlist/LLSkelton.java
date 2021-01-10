package com.anilt.ds.linkedlist;

public class LLSkelton 
{
	static Node head;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		LLSkelton ll = new LLSkelton();
		ll.head = new Node(1);
		Node second = new Node(2);
		ll.head.next = second;
		Node third = new Node(3);
		second.next = third;
		
		Node fourth = new Node(4);
		third.next = fourth;
		
		Node fifth = new Node(5);
		fourth.next = fifth;
		
		Node sixth = new Node(5);
		fifth.next = sixth;
		
		ll.printList();
		ll.printMiddle();
		
	}
	public void printList()
	{
		Node n = head;
		while(n != null)
		{
			System.out.println(n.data);
			n = n.next;
		}
		
	}
	/* Function to print middle of linked list */
    void printMiddle() 
    { 
        Node slow_ptr = head; 
        Node fast_ptr = head; 
        if (head != null) 
        { 
            while (fast_ptr != null && fast_ptr.next != null) 
            { 
                fast_ptr = fast_ptr.next.next; 
                slow_ptr = slow_ptr.next; 
            } 
            System.out.println("The middle element is [" + 
                                slow_ptr.data + "] \n"); 
        } 
    } 

}
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		this.data = d;
	}
}
