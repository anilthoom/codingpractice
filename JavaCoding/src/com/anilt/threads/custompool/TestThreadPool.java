package com.anilt.threads.custompool;

public class TestThreadPool 
{
	//https://makeinjava.com/custom-thread-pool-java-example-without-executor-framework/
	public static void main(String[] args) throws InterruptedException 
	{
		//create queue size - 3
    	//Number of threads - 4
		ThreadPool tp = new ThreadPool(3, 4);

		//Created 15 Tasks and submit to pool
		for(int i =1; i<=15; i++)
		{
			TestTask task = new TestTask(i);
			tp.submitTask(task);
		}
	}
}
