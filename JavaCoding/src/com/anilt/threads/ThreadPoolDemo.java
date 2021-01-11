package com.anilt.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo 
{
	public static void main(String[] args) 
	{
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i=0; i<10; i++)
		{
			Runnable worker = new WorkerThreadDemo("Thread : "+i);
			executor.execute(worker);
		}
		executor.shutdown();
		  while (!executor.isTerminated()) {   }  
		  
	        System.out.println("Finished all threads");  
	}
}
class WorkerThreadDemo implements Runnable
{
	private String message;
	
	public WorkerThreadDemo(String msg) 
	{
		this.message = msg;
	}
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName() +" :(Start) message : "+message);
		processMessage();
		System.out.println(Thread.currentThread().getName() +" :(End)");
	}
	public void processMessage()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}