package com.anilt.java.features.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExploration {
    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("Total Processors : "+ coreCount);
        ExecutorService service = Executors.newFixedThreadPool(coreCount);
        long startTime = System.currentTimeMillis();
        for (int i=0; i< 1000; i++){
            service.execute(new Task());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("TOTAL TIME TAKEN : "+ (endTime-startTime) + " MILLISECONDS");
    }
}
class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Run... run..." + Thread.currentThread().getName());
    }
}
