package com.anilt.threads.custompool;

public class CustomTask implements Runnable
{
	private int taskNumber;
	public CustomTask(int n) 
	{
		this.taskNumber = n;
	}
	@Override
	public void run() 
	{
		//Business task logic here.
		try {
			System.out.println("Task number is : "+this.taskNumber);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
