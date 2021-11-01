package com.anilt.ds.linkedlist;

//A simple Java program to introduce a linked list 
class LinkedListTest 
{ 
	NodeTest head; // head of list 
	NodeClass head1;
	/* Linked list NodeTest. This inner class is made static so that 
	main() can access it */
	static class NodeTest { 
		int data; 
		NodeTest next; 
		NodeTest(int d) { data = d; next=null; } // Constructor 
	} 

	/* method to create a simple linked list with 3 nodes*/
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		LinkedListTest llist = new LinkedListTest(); 

		llist.head = new NodeTest(1); 
		NodeTest second = new NodeTest(2); 
		NodeTest third = new NodeTest(3); 

		/* Three nodes have been allocated dynamically. 
		We have references to these three blocks as first,
		second and third 

		llist.head	 second			 third 
			|			 |				 | 
			|			 |				 | 
		+----+------+	 +----+------+	 +----+------+ 
		| 1 | null |	 | 2 | null |	 | 3 | null | 
		+----+------+	 +----+------+	 +----+------+ */

		llist.head.next = second; // Link first node with the second node 

		/* Now next of first NodeTest refers to second. So they 
			both are linked. 

		llist.head	 second			 third 
			|			 |				 | 
			|			 |				 | 
		+----+------+	 +----+------+	 +----+------+ 
		| 1 | o-------->| 2 | null |	 | 3 | null | 
		+----+------+	 +----+------+	 +----+------+ */

		second.next = third; // Link second node with the third node 

		/* Now next of second NodeTest refers to third. So all three 
			nodes are linked. 

		llist.head	 second			 third 
			|			 |				 | 
			|			 |				 | 
		+----+------+	 +----+------+	 +----+------+ 
		| 1 | o-------->| 2 | o-------->| 3 | null | 
		+----+------+	 +----+------+	 +----+------+ */
//		System.out.println(llist.head.data);
//		System.out.println(second.data);
//		System.out.println(second.next.data);
		llist.printList();
		
		LinkedListTest lLTest = new LinkedListTest();
		lLTest.head1 = new NodeClass(101);
		NodeClass second1 = new NodeClass(102);
		NodeClass third1 = new NodeClass(103);
		
		lLTest.head1.next = second1;
		second1.next = third1;
		
	}
	static class NodeClass
	{
		NodeClass next;
		int empNo;
		NodeClass(int eNo)
		{
			empNo = eNo;
			next = null;
		}
	}
	/* This function prints contents of linked list starting from head */
    public void printList() 
    { 
        NodeTest n = head; 
        while (n != null) 
        { 
            System.out.print(n.data+" "); 
            n = n.next; 
        } 
    } 
}