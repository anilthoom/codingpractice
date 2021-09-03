package com.anilt.java.features.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExploration {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new Task());
    }
}
class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Run... run..." + Thread.currentThread().getName());
    }
}
