package com.anilt.ds.stack;

/*
 * Stack Implementation using Arrays
 */
public class StackImpl {

	public static void main(String[] args) 
	{
		Stack sk = new Stack();
		sk.push(1);
		sk.push(2);
		sk.push(3);
		sk.push(4);
		sk.push(5);
		sk.push(6);
		
		sk.pop();
		sk.pop();
		sk.printStack();
	}

}
class Stack
{
	static final int MAX = 5; 
	int a[] = new int[MAX];
	int top;
	Stack()
	{
		top = -1;
	}
	boolean push(int x)
	{
		if( top >= MAX-1 )
		{
			System.out.println("Stack Overflow !!!");
			return false;
		}
		else
		{
			a[++top] = x;
			System.out.println(x+ " : Pushed to stack!");
			return true;
		}
	}
	int pop()
	{
		if(top>0)
		{
			int x = a[top--];
			System.out.println(x +" : Pop from stack");
			return x;
		}
		else
		{
			System.out.println("Stack Underflow!");
			return 0;
		}
	}
	void printStack()
	{
		System.out.print("From Stack { ");
		for (int i : a) {
			System.out.print(i);
		}
		System.out.print(" }");
	}
}