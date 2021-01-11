package com.anilt.threads.custompool;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;

public class BlockingQueue<Type>
{
	private Queue<Type> queue = new LinkedList<>();
	private int EMPTY = 0;
	private int MAX_TASK_IN_QUEUE = -1;
	
	public BlockingQueue(int size) 
	{
		this.MAX_TASK_IN_QUEUE = size;
	}
	
	public synchronized void enqueue(Type task) throws InterruptedException
	{
		while(queue.size() == this.MAX_TASK_IN_QUEUE)
		{
			System.err.println("Waiting.......");
			wait();
		}
		if(this.queue.size() == EMPTY)
		{
			System.err.println("NotifyAll.......");
			notifyAll();
		}
		this.queue.offer(task);
	}
	
	public synchronized Type dequeue() throws InterruptedException
	{
		while(this.queue.size() == EMPTY)
		{
			wait();
		}
		if(this.queue.size() == this.MAX_TASK_IN_QUEUE)
		{
			notifyAll();
		}
		return this.queue.poll();
	}

}
