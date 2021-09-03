package com.anilt.java.features.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTypes {
    public static void main(String[] args) {
        // Fixed thread pool
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);

        // Cached thread pool
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i<10; i++){
            cachedThreadPool.execute(new TaskHandler("CACHED THREAD POOL"));
        }
        // Scheduled thread pool
        ScheduledExecutorService scheduledThreadPoolService = Executors.newScheduledThreadPool(10);
        scheduledThreadPoolService.schedule(new TaskHandler("SCHEDULED THREAD POOL"), 10, TimeUnit.SECONDS);
        scheduledThreadPoolService.scheduleAtFixedRate(new TaskHandler("SCHEDULED AT FIXED RATE"), 15, 10, TimeUnit.SECONDS);
        scheduledThreadPoolService.scheduleWithFixedDelay(new TaskHandler("SCHEDULED AT FIXED DELAY"), 13, 12, TimeUnit.SECONDS);
        // Single threaded executor
    }
}
class TaskHandler implements Runnable{
    private String message;

    public TaskHandler(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message+ " : " + Thread.currentThread().getName());
    }
}
