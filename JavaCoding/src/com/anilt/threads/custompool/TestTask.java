package com.anilt.threads.custompool;

public class TestTask implements Runnable
{
	private int number;
	public TestTask(int n) 
	{
		this.number = n;
	}
	
	@Override
	public void run() 
	{
		System.out.println("Start executing of task number : "+number);
		try
		{
			//Perform tasks business logic here....
			
			Thread.sleep(1000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("End of execution task number : "+number);	
	}
}
