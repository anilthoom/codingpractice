package com.anilt.java.features.threads;

public class ThreadUsage {
    public static void main(String[] args) {
        new Thread(new TaskT()).start();
        new Thread(new TaskR()).start();
    }
}
class TaskT extends Thread{
    @Override
    public void run() {
        System.out.println("-- Thread class thread ---");
    }
}
class TaskR implements Runnable{
    @Override
    public void run() {
        System.out.println("-- Runnable class thread ---");
    }
}
