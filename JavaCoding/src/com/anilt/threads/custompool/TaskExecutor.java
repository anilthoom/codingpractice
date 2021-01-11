package com.anilt.threads.custompool;

public class TaskExecutor implements Runnable 
{
	BlockingQueue<Runnable> queue;
	
	public TaskExecutor(BlockingQueue<Runnable> q) 
	{
		this.queue = q;
	}
	
	@Override
	public void run() 
	{
		try
		{
			while(true)
			{
				String name = Thread.currentThread().getName();
				Runnable task = queue.dequeue();
				System.out.println("Task started by Thread : " + name);
				task.run();
				System.out.println("Task finished by Thread : " + name);
			}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		
	}
}
