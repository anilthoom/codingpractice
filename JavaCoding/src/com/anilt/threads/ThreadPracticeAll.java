package com.anilt.threads;

public class ThreadPracticeAll 
{
	public static void main(String[] args) 
	{
		ThreadA a = new ThreadA();
		a.start();
		
		ThreadB b = new ThreadB();
		Thread t = new Thread(b);
		t.start();
	}
//	static volatile int counter = 1;
	static int counter = 1;
//	public static synchronized void printCount(String callerName) //First A and then B
	public static void printCount(String callerName)
	{
		for(int i =1; i<= 5; i++)
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(callerName+" : "+i);
		}
	}
}
class ThreadA extends Thread
{
	@Override
	public void run() 
	{
		ThreadPracticeAll.printCount("A");
		ThreadPracticeAll.counter = 5;
		System.out.println("From A: "+ThreadPracticeAll.counter);
	}
}
class ThreadB implements Runnable
{
	@Override
	public void run() 
	{
		ThreadPracticeAll.printCount("B");
		System.out.println("From B: "+ThreadPracticeAll.counter);
	}
}

