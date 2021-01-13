package com.anilt.problems.ll;

public class InsertNodeAtSortedDoubleLL 
{

	public static void main(String[] args) 
	{
		DoublyLinkedListNode head = new DoublyLinkedListNode(2);
		
		DoublyLinkedListNode second = new DoublyLinkedListNode(3);
		head.next = second;
		second.prev = head;
		
		
		
		DoublyLinkedListNode third = new DoublyLinkedListNode(4);
		second.next = third;
		third.prev = second;
		
		DoublyLinkedListNode fourth = new DoublyLinkedListNode(5);
		third.next = fourth;
		fourth.prev = third;
		
		DoublyLinkedListNode resultList = DoublyLinkedListNode.sortedInsert(head, 4);
		
		while(resultList != null)
		{
			System.out.print(resultList.data +" <--> ");
			resultList = resultList.next;
		}
	}

}
class DoublyLinkedListNode 
{
    int data;
    public DoublyLinkedListNode(int d) 
    {
    	data = d;
    	next = null;
		prev = null; 
	}
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;
    
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) 
    {
    	if(head == null)
    	{
    		head = new DoublyLinkedListNode(data);
    	}
    	else
    	{
    		DoublyLinkedListNode currentNode = head;
    		while(currentNode != null)
    		{
    			if(data <= currentNode.data && currentNode.prev == null)
    			{
    				head = new DoublyLinkedListNode(data);
    				head.next = currentNode;
    				currentNode.prev = head;
    				break;
    			}
    			else if(data >= currentNode.data && currentNode.next == null)
    			{
    				DoublyLinkedListNode insertThis = new DoublyLinkedListNode(data);
    				insertThis.prev = currentNode;
    				currentNode.next = insertThis;
    				break;
    			}
    			else if( data >= currentNode.data && data <currentNode.next.data )
    			{
    				DoublyLinkedListNode insertThis = new DoublyLinkedListNode(data);
    				insertThis.prev = currentNode;
    				insertThis.next = currentNode.next;
    				currentNode.next = insertThis;
    				currentNode.next.next.prev = insertThis;
    				break;
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
