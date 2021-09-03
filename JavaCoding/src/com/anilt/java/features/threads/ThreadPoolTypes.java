package com.anilt.java.features.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTypes {
    public static void main(String[] args) {
        // Fixed thread pool
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);

        // Cached thread pool
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i<100; i++){
            cachedThreadPool.execute(new TaskHandler());
        }
        // Scheduled thread pool

        // Single threaded executor
    }
}
class TaskHandler implements Runnable{
    @Override
    public void run() {
        System.out.println("Task executed : "+ Thread.currentThread().getName());
    }
}
