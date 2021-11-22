package com.anil.ds.queue;

import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
    }
}
class MyQueue{
    Stack<Integer> queue1;
    Stack<Integer> queue2;
    public MyQueue() {
        queue1 = new Stack<>();
        queue2 = new Stack<>();
    }
    public void push(int x) {
        queue1.push(x);
    }

    public int pop() {
        int firstElement =-1;
        int size = queue1.size();
        for(int i=1; i<size; i++){
            firstElement = queue1.pop();
            queue2.push(firstElement);
        }
        firstElement = queue1.pop();
        for(int i=1; i<=size-1; i++)
        {
            queue1.push(queue2.pop());
        }
        return firstElement;
    }

    public int peek() {
        return queue1.firstElement();
    }

    public boolean empty() {
        return queue1.empty();
    }
}
