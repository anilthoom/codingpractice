package com.anilt.threads;

public class ThreadWays {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			ThreadDemo td = new ThreadDemo();
			td.start();
		}
		TestCallRun2 t1 = new TestCallRun2();
		t1.setName("Normal Thread Priority");
		t1.setPriority(Thread.MIN_PRIORITY);
//		TestCallRun2 t2 = new TestCallRun2();

//		t1.run();
//		t1.start();
//		t1.join();
//		t2.run();
//		t2.start();
		
		TestPriorityThread tpt = new TestPriorityThread();
		tpt.setName("PRIORITY THREAD");
		tpt.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		tpt.start();
	}

}

class ThreadDemo extends Thread {
	@Override
	public void run() {
//		System.out.println("Current Thread ID: " + Thread.currentThread().getId() + " is running....");
	}
}

class ThreadImpl implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}

class TestCallRun2 extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}

class TestPriorityThread extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1; i<5; i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread Name: "+Thread.currentThread().getName()+" ; Thread Priority: "+ Thread.currentThread().getPriority());
		}
	}
}