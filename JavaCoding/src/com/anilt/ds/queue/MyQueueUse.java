package com.anilt.ds.queue;

import java.util.Scanner;
import java.util.Stack;

//https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues
public class MyQueueUse
{
	public static void main(String[] args) 
	{
		MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
		
	}
}
class MyQueue<T>
{
	Stack<Integer> fifoStack = new Stack<Integer>();
	Stack<Integer> lifoStack = new Stack<Integer>();
	public int peek() 
	{
		return fifoStack.get(0);
	}
	public void dequeue() 
	{
		fifoStack.remove(0);
	}

	public void enqueue(int nextInt) 
	{
		fifoStack.push(nextInt);
		lifoStack.insertElementAt(nextInt, 0);
	}
}
