package com.anilt.threads;

public class ShutdownHookDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new MyThread());
		System.out.println("Ctrl + C to exit thread");
		
		Thread.sleep(5000);
	}

}
class MyThread extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Shutdown task completed");
	}
}
