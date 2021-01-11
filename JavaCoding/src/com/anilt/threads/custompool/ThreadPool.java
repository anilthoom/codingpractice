package com.anilt.threads.custompool;

public class ThreadPool 
{
	BlockingQueue<Runnable> queue;
	public ThreadPool(int qSize, int nThreads) 
	{
		queue = new BlockingQueue<>(qSize);
		
		String threadName = null;
		TaskExecutor taskExe = null;
		
		for(int count = 1; count <= nThreads; count++)
		{
			threadName = "Thread-"+count;
			taskExe = new TaskExecutor(queue);
			Thread th = new Thread(taskExe, threadName);
			th.start();
		}
	}
	
	public void submitTask(Runnable task) throws InterruptedException
	{
		queue.enqueue(task);
	}

}
