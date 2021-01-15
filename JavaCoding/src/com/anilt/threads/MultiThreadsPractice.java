package com.anilt.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadsPractice 
{
	public static void main(String[] args) 
	{
		ExecutorService tPool = Executors.newFixedThreadPool(5);
		for(int i =1; i<=5; i++)
		{
			Runnable r = new MulThreadDemo();
			tPool.execute(r);
		}
		System.out.println("isTerminated : "+tPool.isTerminated());
		tPool.shutdown();
		System.out.println("isTerminated after Shutdown : "+tPool.isTerminated());
		int counter = 0;
		while (!tPool.isTerminated()) 
		{   
			
			System.out.println("Counter : "+ counter++);
		}  
	}
}
class MulThreadDemo extends Thread
{
	@Override
	public void run() 
	{
		try 
		{
			
			System.out.println("SSERERVER");
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
}
