package com.anilt.java.features.threads;

public class ThreadUsage {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i =0; i<1000; i++){
            new Thread(new TaskT()).start();
            new Thread(new TaskR()).start();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("TOTAL TIME TAKEN : "+ (endTime-startTime) + " MILLISECONDS");
    }
}
class TaskT extends Thread{
    @Override
    public void run() {
        System.out.println("-- Thread class thread ---" + Thread.currentThread().getName());
    }
}
class TaskR implements Runnable{
    @Override
    public void run() {
        System.out.println("-- Runnable class thread ---"+ Thread.currentThread().getName());
    }
}
