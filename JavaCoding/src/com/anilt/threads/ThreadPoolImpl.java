package com.anilt.threads;

import java.util.concurrent.LinkedBlockingDeque;

public class ThreadPoolImpl 
{
	public static void main(String[] args) 
	{
		ThreadPool tPool = new ThreadPool(10);
		for(int i=1; i<=5; i++)
		{
			Task t = new Task(i);
			tPool.execute(t);
		}
	}
}
class Task implements Runnable
{
	int num;
	public Task(int n)
	{
		num = n;
	}
	@Override
	public void run() 
	{
		System.out.println("Task "+num+" is running...");
	}
}
class ThreadPool
{
	private final int nThreads;
	private final PoolWorker[] threads;
	private final LinkedBlockingDeque<Runnable> queue;
	public ThreadPool(int n) 
	{
		nThreads = n;
		queue = new LinkedBlockingDeque<Runnable>();
		threads = new PoolWorker[nThreads];
		for(int i=0; i<nThreads; i++)
		{
			threads[i] = new PoolWorker();
			threads[i].start();
		}
	}
	public void execute(Runnable task)
	{
		synchronized (queue) 
		{
			queue.add(task);
			queue.notify();
		}
	}
	
	private class PoolWorker extends Thread
	{
		public void run()
		{
			Runnable task;
			while(true)
			{
				synchronized (queue) 
				{
					while(queue.isEmpty())
					{
						try {
							queue.wait();
						} catch (InterruptedException e) 
						{
							System.out.println("An error occured while queue is waiting");
							e.printStackTrace();
						}
					}
					task = queue.poll();
				}
				try
				{
					task.run();
				}
				catch(RuntimeException re)
				{
					System.out.println("Thread pool is interupted due to an issue.."+re.getMessage());
				}
			}
		}
	}
}